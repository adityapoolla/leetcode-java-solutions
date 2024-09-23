package problems1To100.problem74;
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int t = 0;
        int b = matrix.length - 1;
        while(t <= b) {
            int c = t + (b - t) / 2;
            if(c < matrix.length - 1 && matrix[c][0] <= target && target < matrix[c + 1][0]) {
                return binarySearch(matrix[c], target);
            } else if(c == matrix.length - 1 && matrix[c][0] <= target ) {
                return binarySearch(matrix[c], target);
            } else if(target < matrix[c][0]) {
                b = c - 1;
            } else {
                t = c + 1;
            }
        } 
        return false;
    }

    private boolean binarySearch(int[] row, int target) {
        int l = 0, r = row.length - 1;
        while(l <= r) {
            int m = l + (r - l)/2;
            if(row[m] == target) return true;
            else if(row[m] < target) l = m + 1;
            else r = m - 1;
        }
        return false;
    }
}