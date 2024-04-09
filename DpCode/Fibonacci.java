public class Fibonacci {

     //using variable
    public static int fib(int n){
        int a=0,b=1,c=a+b;
        if(n<=1){
            return n;
        }
        for(int i=1;i<n;i++){
           c=a+b;
           a=b;
           b=c; 
        }
        return c;
       //Tc-O(n),Sc-O(1)
    }
    

    //using recursion
    public static int fibo(int n){
        if(n==0){
            return n;
        }
        if(n==1){
            return n;
        }
        //TC-O(2^n),SC-O(n)
        return fibo(n-1)+fibo(n-2);
    }

    //using-Recursion & memoization(top-down)
    public static int fiboMemo(int n,int dp[]){
       
        if(n<=1){
            return n;
        }
        if (dp[n] != -1) {
            return dp[n];
        }
        //Tc-O(n),sc-O(n)
        dp[n] = fiboMemo(n - 1, dp) + fiboMemo(n - 2, dp);
        return dp[n];
    }

    //Buttom-Up concept
    public static int fiboButtom(int n,int dp[]){
        if(n<=1){
            return n;
        }
         dp[0]=0;
         dp[1]=1;
        for(int i=2;i<n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        //TC-O(n),Sc-O(n)
        return dp[n];
    }

    public static void main(String args[]){
        int n=5;
        int dp[]=new int [n+1];
        Arrays.fill(dp, -1); // Initialize dp array with -1
        System.out.println(fib(n)); 
        System.out.println(fibo(n)); 
        System.out.println(fiboMemo(n,dp)); 
        System.out.println(fiboButtom(n,dp));  
    }   
}
