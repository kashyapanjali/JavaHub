import java.util.*;
public class checkpalindrome {
    public static boolean check(String Str){
        // Run to the half String
        for(int i=0;i<Str.length()/2;i++){
            int n=Str.length();

            //when string of first character is not equal to string of last character
            if(Str.charAt(i)!=Str.charAt(n-i-1)){
                return false;
            }

        }
        return true;

    }
    
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        String name=sc.next();
        System.out.println(check(name));
        
        //time complexity=O(n); due to single loop
        sc.close();
    }
    
}
