import java.util.Arrays;
public class HouseRobTwo{

    //using recursion
    public int rob1(int[] nums) {
        return robhelp1(nums, nums.length - 1);
    }

    private int robhelp1(int[] nums, int i) {
        if (i < 0) return 0;
        return Math.max(robhelp1(nums, i - 2) + nums[i], robhelp1(nums, i - 1));
    }
    

    //using top-down dp
        private int[] memo;
    
        public int rob2(int[] nums) {
            memo = new int[nums.length];
            Arrays.fill(memo, -1);
            return robhelp2(nums, nums.length - 1);
        }
    
        private int robhelp2(int[] nums, int i) {
            if (i < 0) return 0;
            if (memo[i] >= 0) return memo[i];
            memo[i] = Math.max(robhelp2(nums, i - 2) + nums[i], robhelp2(nums, i - 1));
            return memo[i];
        }
     
    
    //using buttom-up
        public int rob3(int[] nums) {
            int n = nums.length;
            if (n == 0) return 0;
            if (n == 1) return nums[0];
            
            int[] dp = new int[n];
            dp[0] = nums[0];
            dp[1] = Math.max(nums[0], nums[1]);
            
            for (int i = 2; i < n; i++) {
                dp[i] = Math.max(dp[i - 2] + nums[i], dp[i - 1]);
            }
            
            return dp[n - 1];
        }
    
    //using constant

        public int rob4(int[] nums) {
            int n = nums.length;
            if (n == 0) return 0;
            if (n == 1) return nums[0];
            
            int prev2 = nums[0];
            int prev1 = Math.max(nums[0], nums[1]);
            
            for (int i = 2; i < n; i++) {
                int curr = Math.max(prev2 + nums[i], prev1);
                prev2 = prev1;
                prev1 = curr;
            }
            
            return prev1;
        }
      
    public static void main(String args[]){ 
        HouseRobTwo houseRobber = new HouseRobTwo(); // Create an instance of HouseRobTwo
        int nums[] = {1, 2, 3, 1,7,8};
        System.out.println(houseRobber.rob1(nums));// Call rob method using the instance
        System.out.println(houseRobber.rob2(nums)); 
        System.out.println(houseRobber.rob3(nums));
        System.err.println(houseRobber.rob4(nums));
    }

}