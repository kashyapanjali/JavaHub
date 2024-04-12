public class Prefix_sum {
   
    public static void maxSubarraysum(int num[]){
        int currSum=0;
        int prefix[]=new int[num.length];
        prefix[0]=num[0];

        //calculte prefix array

        for(int i=1;i<prefix.length;i++){
            prefix[i]=prefix[i-1]+num[i];
        }

        int maxSum = Integer.MIN_VALUE; // Initialize maxSum with the smallest possible integer value
        
        // Find the maximum sum subarray using prefix sums//TC-O(n)
        for(int i = 0; i < num.length; i++) {
            int start=i;
            for(int j = i; j < num.length; j++) {
                int end=j;
                currSum =start== 0 ? prefix[end] : prefix[end] - prefix[start- 1];
                if(maxSum < currSum) {
                    maxSum = currSum;
                }
            }
        }

        System.out.println("The largest sum of subarray is: " + maxSum);
    }
    public static void main(String args[]){
        int num[]={3,4,-2,6,-19};
        maxSubarraysum(num);
    }
}
