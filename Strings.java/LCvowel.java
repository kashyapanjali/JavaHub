import java.util.*;
public class LCvowel {
    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

       // String str=new Scanner (System.in).nextLine();
        String str=sc.nextLine();
        int count=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                count++;
            }
        }
        System.out.println(count);
        sc.close();
    }
    
}