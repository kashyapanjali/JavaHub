import java.util.HashMap;

public class DuplicateString {
    public static void printDuplicate(String str){
        HashMap <Character, Integer>hm = new HashMap<>();
        int n = str.length();
        for(int i = 0; i < n; i++){
            char ch = str.charAt(i);
            hm.put(ch, hm.getOrDefault(ch, 0)+1);
        }
        for(char ch : hm.keySet()){
            if(hm.get(ch)>1){
                System.out.println(ch + " : " + hm.get(ch));
            }
        }
    }

    public static void main(String args[]){
        String str = "programming";
        printDuplicate(str);
    }
    
}
