public class CountingSort {
    public static void main(String args[]) {
        int arr[] = {4, 2, 2, 8, 3, 3, 1};
        int n = arr.length;
        
        // Find the maximum element in the array
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        // Create a count array to store the count of each element
        int[] count = new int[max + 1];
        for (int i = 0; i < n; i++) {
            count[arr[i]]++;
        }

        // Modify the count array to store the cumulative count
        for (int i = 1; i <= max; i++) {
            count[i] += count[i - 1];
        }

        // Create the output array
        int output[] = new int[n];

        // Build the output array by placing elements in their correct positions
        for (int i = n - 1; i >= 0; i--) {
            output[count[arr[i]] - 1] = arr[i];
            count[arr[i]]--;
        }

        // Copy the output array to the original array
        for (int i = 0; i < n; i++) {
            arr[i] = output[i];
        }

        // Print the sorted array
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
    
