public class checkpairs {

    // print pairs of array
    public static void pairs(int arr[]){
        //total number of pairs
        int tp=0;
        for(int i=0;i<arr.length;i++){
            int current=arr[i];
            for(int j=i+1;j<arr.length;j++){
             System.out.print("("+current+","+arr[j]+")");
             tp++;
            }
            System.out.println();
        }
        System.out.println(tp);
        System.out.println();
    }

    public static void printsubarray(int arr[]){
        //int ts=0;
        int sum=0;
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            int start=i;
            for(int j=i;j<arr.length;j++){
                int end=j;
                sum=0;
                for(int k=start;k<=end;k++)//subarray
                {
                    System.out.print(arr[k]);

                   
                    sum=sum+arr[k];
                  //  ts++;
                }
                if(largest<sum){
                    largest=sum;
                }
                System.out.println(sum);
            }
        }//System.out.println("total number of subarray is"+ts);
        System.out.print("largest subarray sum is:"+largest);
    }
    
    //kadane's Algorithm

    public static void kadanes(int arr[]){
        int ms=Integer.MIN_VALUE;
        int cs=0;
        for(int i=0;i<arr.length;i++){
            cs=cs+arr[i];
            if(cs<0){
                cs=0;
            }
            ms=Math.max(cs,ms);
        }
        System.out.println("\nMaximum subarray sum is:"+ms);
    }
    public static void main(String args[]){
        int numbers[]={2,-3,6,-8,5,3};
        // print pairs of arrays
        pairs(numbers);
        //print subarrays
        printsubarray(numbers);
        kadanes(numbers);
    }
    
}
