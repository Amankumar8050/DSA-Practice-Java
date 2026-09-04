class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int s = 0;
        int e = arr.length - 1;
        int ans = -1;

        while (s <= e) {
            int mid = s + (e - s) / 2;

            if (arr[mid] < arr[mid + 1]) {
                // Increasing side
                s = mid + 1;
            } 
            else {
                // Decreasing side → mid can be peak
                ans = mid;
                e = mid - 1;
            }
        }

        return ans;
    }
}