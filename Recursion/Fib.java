//WAP to print Nth fibonacci series.

public class Fib {
    public static int printfib(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        return printfib(n-1)+printfib(n-2);
    }
    public static void main(String args[]){
        System.out.println(printfib(6));
    }
}
