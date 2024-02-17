import java.util.*;
public class ternary {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int marks=sc.nextInt();
        String report= marks>=33?"pass":"fail";
        System.out.println(report);
        sc.close();
}     
}