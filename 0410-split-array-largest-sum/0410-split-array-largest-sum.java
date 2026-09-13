class Solution {

    static boolean isValidAnswer(int nums[], int k, int maxPages) {

        int studentCount = 1;
        int pages = 0;

        for (int i = 0; i < nums.length; i++) {

            if (pages + nums[i] <= maxPages) {
                pages += nums[i];
            } 
            else {
                studentCount++;

                if (studentCount > k || nums[i] > maxPages) {
                    return false;
                }

                pages = nums[i];
            }
        }

        return true;
    }

    public int splitArray(int[] nums, int k) {

        int sum = 0;
        int s = 0;

        // Minimum possible answer = maximum element
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            s = Math.max(s, nums[i]);
        }

        // Maximum possible answer = total sum
        int e = sum;

        while (s < e) {

            int mid = s + (e - s) / 2;

            if (isValidAnswer(nums, k, mid)) {
                e = mid;
            } 
            else {
                s = mid + 1;
            }
        }

        return s;
    }
}