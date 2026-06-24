class Solution {
    public int removeDuplicates(int[] nums) {
        int low = 1 ;
        int high = 1;

        while (high < nums.length) {
            if (nums[high] != nums[high - 1]) {
                nums[low] = nums[high] ;
                low++;
            }
            high++;
        }
        return low;
    }
}