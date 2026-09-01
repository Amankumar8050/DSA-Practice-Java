class Solution {
    public void setZeroes(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;

        boolean[] Zerorow = new boolean[n];
        boolean[] Zerocoln = new boolean[m];

        for (int i = 0 ; i < n ; i++) {
            for (int j = 0 ; j < m; j++) {
                 if (matrix[i][j] == 0) {
                    Zerorow[i] = true;
                    Zerocoln[j] = true;
                }
                
            }
        }
        for (int i = 0 ; i < n ;i++) {
            for(int j = 0 ; j < m ;j++){
                if (Zerorow[i] || Zerocoln[j] ) {
                    matrix[i][j] = 0 ;
                }
            }
        }
    }
}