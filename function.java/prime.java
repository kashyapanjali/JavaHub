import java.util.*;
public class prime {
    public static boolean primenum(int n){
        if(n==2){
            return true;
        }
        for(int i=2;i<=Math.sqrt(n);i++)
        //for(int i=2;i<=n-1;i++)
        {
            if(n%i==0){
                return false;
            }    
        } return true;
    }
    public static int primeinrange(int a,int b){
        System.out.println("prime number between two number are:");
        for(int i=a;i<=b;i++){
            if(primenum(i)){
                System.out.println(+i);
            }
        }
        return 1;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        primenum(n);
        System.out.println(primenum(n));
        System.out.println(primeinrange( 10,100));
        sc.close();
    } 
    
}
