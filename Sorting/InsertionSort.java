public class InsertionSort {
    public static void main(String args[]){
        int arr[]={5,4,1,3,2};
        int n=arr.length;
        for(int i=0;i<n;i++){
            int curr=arr[i];
            int prev=i-1;
            while(prev>=0 && arr[prev]>curr){
                arr[prev+ 1] = arr[prev];
                prev = prev- 1;
            }
            arr[prev+ 1] = curr;
        }

        // Print the sorted array
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        
    }
    
}
