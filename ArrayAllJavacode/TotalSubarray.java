public class TotalSubarray {
    public static void printsubarray(int arr[]) {

        int ts = 0; // initialize total number of subarrays outside the loop    
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                for (int k = i; k <= j; k++) { // subarray
                    System.out.print(arr[k] + " "); // subarray print
                }
                System.out.println();
                ts++; // increment total number of subarrays
            }
        }
        System.out.println("total number of subarray is " + ts); // print total number of subarrays
    }
  
    public static void main(String args[]){
        int array[]={3,2,6,8};
        printsubarray(array);
    }
    
}
