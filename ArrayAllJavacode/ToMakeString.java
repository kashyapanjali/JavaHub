import java.util.Comparator;
import java.util.Arrays;

public class ToMakeString {

    public static String makeLargestString(String arr[]){
          // Sort the array based on custom comparator
        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                // Concatenate both ways
                String order1 = a + b;
                String order2 = b + a;
                // Compare to find the largest
                return order2.compareTo(order1);
            }
        });

        // Handle edge case for leading zeros
        if (arr[0].equals("0")) {
            return "0";
        }

        // Build the final string
        StringBuilder result = new StringBuilder();
        for (String str : arr) {
            result.append(str);
        }

        return result.toString();
    }

    public static void main(String args[]){
         String arr [] = {"3", "30", "34", "5", "9"};
         System.out.println(makeLargestString(arr));
    }
}
    

