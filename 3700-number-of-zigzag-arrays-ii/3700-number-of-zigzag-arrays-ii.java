class Solution {
    static final long MOD = 1_000_000_007L;

    public int zigZagArrays(int n, int l, int r) {
        int m = r - l + 1;

        int size = 2 * m;

        long[] base = new long[size];

        // Base state for length = 2
        for (int v = 0; v < m; v++) {
            base[v] = v;               // UP
            base[m + v] = m - 1 - v;  // DOWN
        }

        if (n == 2) {
            long ans = 0;
            for (long x : base) {
                ans = (ans + x) % MOD;
            }
            return (int) ans;
        }

        long[][] T = new long[size][size];

        // Unew[v] = sum(D[u]) where u < v
        for (int v = 0; v < m; v++) {
            for (int u = 0; u < v; u++) {
                T[v][m + u] = 1;
            }
        }

        // Dnew[v] = sum(U[u]) where u > v
        for (int v = 0; v < m; v++) {
            for (int u = v + 1; u < m; u++) {
                T[m + v][u] = 1;
            }
        }

        long[][] power = matrixPower(T, n - 2);

        long[] result = multiply(power, base);

        long ans = 0;
        for (long x : result) {
            ans = (ans + x) % MOD;
        }

        return (int) ans;
    }

    private long[] multiply(long[][] A, long[] v) {
        int n = A.length;
        long[] res = new long[n];

        for (int i = 0; i < n; i++) {
            long sum = 0;

            for (int j = 0; j < n; j++) {
                sum = (sum + A[i][j] * v[j]) % MOD;
            }

            res[i] = sum;
        }

        return res;
    }

    private long[][] matrixPower(long[][] mat, long exp) {
        int n = mat.length;

        long[][] result = new long[n][n];

        for (int i = 0; i < n; i++) {
            result[i][i] = 1;
        }

        while (exp > 0) {
            if ((exp & 1) == 1) {
                result = multiply(result, mat);
            }

            mat = multiply(mat, mat);

            exp >>= 1;
        }

        return result;
    }

    private long[][] multiply(long[][] A, long[][] B) {
        int n = A.length;

        long[][] res = new long[n][n];

        for (int i = 0; i < n; i++) {
            for (int k = 0; k < n; k++) {

                if (A[i][k] == 0) continue;

                long val = A[i][k];

                for (int j = 0; j < n; j++) {
                    if (B[k][j] == 0) continue;

                    res[i][j] = (res[i][j] + val * B[k][j]) % MOD;
                }
            }
        }

        return res;
    }
}