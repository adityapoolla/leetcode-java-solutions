package problems501To600.problem566;
class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length, n = mat[0].length;
        if(m * n != r * c) return mat;
        int[][] result = new int[r][c];
        int count = 0;
        int rc = 0;
        for(int i = 0; i < mat.length; i++) {
            for(int j = 0; j < mat[i].length; j++) {
                if(count < c ) {
                    result[rc][count] = mat[i][j];
                    count++;
                } else {
                    result[++rc][0] = mat[i][j];
                    count = 1;
                }
            }
        }
        return result;
    }
}