import java.util.*;
public class fact {
    public static int factorial(int n){
        int facto=1;
        for(int i=2;i<=n;i++){
            facto=facto*i;
        }System.out.println(facto);
        return 0;
    }
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        factorial(n);
        //System.out.println(fact);
       sc.close();
    }
}
