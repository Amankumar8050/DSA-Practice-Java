class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int totalRows = matrix.length;
        int totalColumns = matrix[0].length ;
        int n = totalRows * totalColumns ;

        int s = 0 ;
        int e = n - 1;

        while (s <= e) {
            int mid = s + (e - s)/2;
            int rowIndex = mid / totalColumns;
            int colIndex = mid % totalColumns ;

            if (matrix[rowIndex][colIndex] == target){
                return true;
            }
            else if (matrix[rowIndex][colIndex] < target){
                s = mid + 1;
            }
            else {
                e = mid - 1 ;
            }
        }
        return false;
    }
}