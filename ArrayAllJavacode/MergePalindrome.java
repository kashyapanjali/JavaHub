public class MergePalindrome {

    public static int mergePalSum(int arr[], int i, int j){
        if (i >= j) {
            return 0;
        }
        if (arr[i] == arr[j]) {
            return mergePalSum(arr, i + 1, j - 1);
        } else if (arr[i] < arr[j]) {
            arr[i + 1] += arr[i];
            return 1 + mergePalSum(arr, i + 1, j);
        } else {
            arr[j - 1] += arr[j];
            return 1 + mergePalSum(arr, i, j - 1);
        }
    }

    public static void main(String args[]){
          int arr[] ={1, 5, 4,2, 1};
          System.out.println(mergePalSum(arr, 0, arr.length-1));

    }
    
}
