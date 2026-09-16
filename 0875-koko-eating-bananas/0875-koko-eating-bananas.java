class Solution {

    static boolean isValidAns(int[] piles, int h, int speed) {

        long totalhours = 0;

        for (int i = 0; i < piles.length; i++) {

            long hours = piles[i] / speed;

            if (piles[i] % speed != 0) {
                hours++;
            }

            totalhours += hours;
        }

        if (totalhours <= h) {
            return true;
        }

        return false;
    }

    public int minEatingSpeed(int[] piles, int h) {

        int n = piles.length;

        int max = 0;

        for (int i = 0; i < n; i++) {
            max = Math.max(max, piles[i]);
        }

        int s = 1;
        int e = max;

        int ans = -1;

        while (s <= e) {

            int mid = s + (e - s) / 2;

            if (isValidAns(piles, h, mid)) {
                ans = mid;
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }

        return ans;
    }
}