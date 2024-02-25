public class KsubArray {

    //time compleity:O((n-1)c(k-1))
    //space complexity:O(n)
    public static int ans=10000000;
    public static void solve(int arr[],int n,int k,int index,int sum, int maxsum){
        if(k==1){
            maxsum=Math.max(maxsum,sum);
            sum=0;
            for(int i=index;i<n;i++){
                sum+=arr[i];
            }
            maxsum=Math.max(maxsum,sum);
            ans=Math.min(ans,maxsum);
            return;
        }
        sum=0;
        for(int i=index;i<n;i++){
            sum+=arr[i];
            maxsum=Math.max(maxsum,sum);
            solve(arr,n,k-1,i+1,sum,maxsum);
        }
       
    }
    public static void main(String args[]){
        int arr[]={1,2,3,4};
        int k=3; //k divisions
        int n=4;//size of an array
        solve(arr,n,k,0,0,0);
        System.out.print(ans+"\n");
    }
    
}
