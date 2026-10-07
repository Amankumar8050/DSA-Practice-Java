class Solution {

    public int reversePairs(int[] nums) {
        return sort(nums, 0, nums.length - 1);
    }

    static int sort(int[] a, int l, int r) {

        if (l >= r) return 0;

        int mid = l + (r - l) / 2;

        int count = sort(a, l, mid);
        count += sort(a, mid + 1, r);

        int j = mid + 1;

        for (int i = l; i <= mid; i++) {
            while (j <= r && (long)a[i] > 2L * a[j]) {
                j++;
            }
            count += j - (mid + 1);
        }

        int[] temp = new int[r - l + 1];

        int i = l;
        j = mid + 1;
        int k = 0;

        while (i <= mid && j <= r) {
            if (a[i] <= a[j])
                temp[k++] = a[i++];
            else
                temp[k++] = a[j++];
        }

        while (i <= mid) temp[k++] = a[i++];
        while (j <= r) temp[k++] = a[j++];

        for (i = l, k = 0; i <= r; i++, k++) {
            a[i] = temp[k];
        }

        return count;
    }
}