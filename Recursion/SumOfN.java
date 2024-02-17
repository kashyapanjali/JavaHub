//WAP to print sum of n natural number
public class SumOfN {

    public static int printSum(int n){
        if(n==1){
            return n;
        }
        return n+printSum(n-1);
    }
    public static void main(String args[]){
        System.out.println(printSum(6));
    }
    
}
