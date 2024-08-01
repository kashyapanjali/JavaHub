public class StepArray {
    public static int stepIndexReturn(int arr[], int n, int x, int k){
         n = arr.length;
         int i = 0;
         while(i < n){
            if(arr[i] == x){
                return i;
            }

            int step = Math.max(1, Math.abs(arr[i] - x)/k);
            i += step;
         }
         return -1;
    }

    public static void main(String args[]){
        int arr[] = {4, 5, 6, 7, 8};
        int n = arr.length;
        int x = 9;
        int k = 2;
        System.out.println(stepIndexReturn(arr, n, x, k));
    }
    
}
