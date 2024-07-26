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
        //flag to check positive or negative //O(2*n)
        long skip=maxsubsum(nums,idx+1,flag);
        long val=nums[idx];
        if(flag!=true){
            val=-val;
        }
        
        long take=maxsubsum(nums,idx+1, !flag)+val;
        return (int) (dp[idx][(flag) ? 1 : 0] = Math.max(skip, take));    }
    
        //buttom up
    public static int buttomup(int nums[],int idx){
        int n=nums.length;
        if(idx>=n){
            return 0;
        }
         int pos[]=new int[n];
         int neg[]=new int[n];

        // Base case: For the first element, the sum is the element itself
        pos[0] = nums[0];
        neg[0] = 0; // Since there's no negative value initially
    
        for(int i=1;i<n;i++){
            pos[i] = Math.max(pos[i - 1], neg[i - 1] + nums[i]);
            neg[i] = Math.max(neg[i - 1], pos[i - 1] - nums[i]);
        }

      // Return the maximum of the last elements of both arrays
       return Math.max(pos[n - 1], neg[n - 1]);        
    }
    public static void main(String args[]){
        int nums[] = {1, 2, 3, 1};
        dp = new long[nums.length][2];
        for (int i = 0; i < nums.length; i++) {
            Arrays.fill(dp[i], -1);
        }
        System.out.println(maxsubsum(nums, 0, true));
        System.out.println(buttomup(nums, 0));
    } 
}
