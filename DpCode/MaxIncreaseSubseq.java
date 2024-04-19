import java.util.Arrays;
public class MaxIncreaseSubseq {
    static int[][] dp;
    public static int maxSubseq(int nums[],int i,int p){  //TC-O(n^2)

        int n=nums.length;
        if(i>=n){
          return 0;
        }
        if(p!=-1&&dp[i][p]!=-1){
            return dp[i][p];
        }
        
        int take=0;
        if(p==-1||nums[i]>nums[p]){
            take=1+maxSubseq(nums, i+1,i);
        }
        
        int skip=maxSubseq(nums, i+1,p);
        int result=Math.max(take,skip);

        if(p!=-1){
            dp[i][p]=result;
        }

        return result;
    }
    
    public static int lis(int  nums[]){
        int n = nums.length;
        int[] dp = new int[n];
        for (int i = 0; i < n; i++) {
            dp[i] = 1; // Initialize LIS value for each index
        }
        int maxLIS = 1; 
        for (int i = 1; i < n; i++) {  //TC-O(n)
            for (int j = 0; j < i; j++) {
                if (nums[j] < nums[i]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            maxLIS = Math.max(maxLIS, dp[i]);
        }
        return maxLIS;

    }

    public static void main(String args[]){
        int nums[]={0,1,0,3,2,3};
        int n=nums.length;
        dp=new int[n][n];
        for(int ele[] : dp) { 
            Arrays.fill(ele,-1);
        }
        System.out.println(maxSubseq(nums, 0, -1));
        System.out.println(lis(nums));
    }
}  

