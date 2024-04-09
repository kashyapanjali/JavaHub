import java.util.Arrays;
public class Stair {
    //using recursion

    public static int getStep(int n){
        if(n<0){
            return 0;
        }
        if(n==0){
            return 1;
        }

        return getStep(n-1)+getStep(n-2);
    }

    //using memoization+recursion//top-down
    public static int get(int n,int dp[]){
        if(n<0){
            return 0;
        }
        if(n==0||n==1){
            return 1;
        }

        if(dp[n]!=-1){
            return dp[n];
        }

        dp[n]=get(n-1, dp)+get(n-2, dp);
        return dp[n];

    }

    //buttom-up step

    public static int stepCount(int n,int dp[]){
        dp[0]=1;
        dp[1]=1;

        for(int i=2;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }

    //using variable 

    public static int stepByValue(int n,int dp[]){
        int a=1,b=1,c=a+b;       
        for(int i=2;i<=n;i++){
            c=a+b;
            a=b;
            b=c;
        }
        return c;
    }


    public static void main(String args[]) {
        int n = 3;
        int dp[] = new int[n+1]; // Corrected array length
        Arrays.fill(dp, -1); 
        System.out.println(getStep(n));
        System.out.println(get(n, dp));
        System.out.println(stepCount(n, dp));
        System.out.println(stepByValue(n, dp));
    }   
}
