import java.util.Arrays;
public class HouseRobber {
    //using recursion Tc-2^n//using memo+recursion//top-down
    public static int getMoney(int n,int nums[]){

        if(n>=nums.length){
           return 0;
        }

        int steal=nums[n]+getMoney(n+2, nums);
        int skip=getMoney(n+1, nums);
        return Math.max(steal,skip);
    }
     
    //using memo+recursion//top-down
    public static int topDown(int n, int nums[], int dp[]) {
        if (n < 0) {
            return 0;
        }
    
        if (dp[n] != -1) {
            return dp[n];
        }
    
        int steal = nums[n] + topDown(n - 2, nums, dp);
        int skip = topDown(n - 1, nums, dp);
        dp[n] = Math.max(steal, skip);
        return dp[n];
    }
    
    
    //using buttom-up approach
    public static int buttomUp(int nums[]){
        int n=nums.length;
        if(n<=0){
            return 0;
        }

        int dp[]=new int[n+1];
        //no house :i=0
        dp[0]=0;
        //1 house :i=1
        dp[1]=nums[0];

        for ( int i = 2; i <= nums.length; i++){
            int steal = nums[i-1] + dp[i-2];
            int skip= dp[i-1];
            dp[i] = Math.max(steal,skip);
        }
        return dp[n];
    }
    
    //using variable
    public static int rob(int[] nums) {
        int n = nums.length;
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return nums[0];
        }
    
        int prevMax = nums[0];
        int currMax = Math.max(nums[0], nums[1]);
    
        for (int i = 2; i < n; i++) {
            int temp = currMax;
            currMax = Math.max(prevMax + nums[i], currMax);
            prevMax = temp;
        }
    
        return currMax;
    }
    
    public static void main(String args[]){
        int nums[]={1,2,3,1,6};
        int dp[]=new int[nums.length + 1];
        Arrays.fill(dp, -1);
        System.out.println(getMoney(0, nums));
        System.out.println(topDown(nums.length - 1, nums, dp));
        System.out.println(buttomUp(nums));
        System.out.println(rob(nums));     
    }   
}
