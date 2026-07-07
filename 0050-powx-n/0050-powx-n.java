class Solution {
    public double myPow(double x, int n) {

        long N = n;
        double ans = 1.0;

        if (N < 0) {
            x = 1.0 / x;
            N = -N;
        }

        while (N > 0) {

            if ((N & 1) == 1) {
                ans *= x;
            }

            x *= x;
            N >>= 1;   // same as N /= 2
        }

        return ans;
    }
}