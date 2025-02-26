import java.util.HashMap;

public class DuplicateOccurrence {
    
    static void duplicatePrint(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        // Count occurrences of each character
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // Print characters that appear more than once
        for (char ch : map.keySet()) {
            if (map.get(ch) > 1) {
                System.out.println(ch + " occurs " + map.get(ch) + " times");
            }
        }
    }

    public static void main(String[] args) {
        String s = "geeksforgeeks";
        duplicatePrint(s);
    }
}
