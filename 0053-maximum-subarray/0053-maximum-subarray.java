class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length ;
        int sum = 0 ;
        int maxSum = Integer.MIN_VALUE;

        for (int i= 0 ; i< n ; i++) {
            // Step 1 :-> Create sum
            sum += nums[i]; 
            // Step 2 :-> Update Sum
            maxSum = Math.max(sum,maxSum) ;

            // Step 3 :-> Compare 
            if (sum < 0) {
                sum = 0;
            }
        }
        return maxSum;
    }
}