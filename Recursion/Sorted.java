//Check if a given array is sorted or not

public class Sorted {
    public static boolean isSortedArr(int arr[],int i){
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return isSortedArr(arr,i+1);
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
         System.out.println(isSortedArr(arr,0)); 
    }  
}
