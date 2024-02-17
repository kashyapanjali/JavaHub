import java.util.*;
public class checkeven {
    public static boolean iseven(int n){
        if(n%2==0){
            return true;
        }
        return false;
    }
    public static int check(int n){
        if(iseven(n)){
            System.out.println("even number");
        }
        else{
            System.out.println("odd number");
        }
        return 0;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        iseven(n);
        int y=check(n);
        System.out.println(iseven(n));
        System.out.println(y);
        sc.close();
    }
}
