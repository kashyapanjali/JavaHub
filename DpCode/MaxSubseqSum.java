import java.util.Arrays;
public class MaxSubseqSum {
    
    static long[][] dp;
    public static long maxsubsum(int nums[],int idx,boolean flag){
        int n=nums.length;
        if(idx>=n){
           return 0;
        }
        if (dp[idx][(flag) ? 1 : 0] != -1) {
            return (int) dp[idx][(flag) ? 1 : 0];
        }
        //flag to check positive or negative
        long skip=maxsubsum(nums,idx+1,flag);
        long val=nums[idx];
        if(flag!=true){
            val=-val;
        }

        long take=maxsubsum(nums,idx+1, !flag)+val;
        return (int) (dp[idx][(flag) ? 1 : 0] = Math.max(skip, take));    }

    public static void main(String args[]){
        int nums[] = {4, 2, 5, 3};
        dp = new long[nums.length][2];
        for (int i = 0; i < nums.length; i++) {
            Arrays.fill(dp[i], -1);
        }
        System.out.println(maxsubsum(nums, 0, true));
    } 
}
