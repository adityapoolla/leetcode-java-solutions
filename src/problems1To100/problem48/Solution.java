package problems1To100.problem48;

class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix[0].length;
        int i = n;
        while(i - 1 >= n - i) {
            util(matrix, n - i, n - i, i - 1,  i - 1);
            i--;
        }
    }
    
    private void util(int[][] matrix, int r1, int c1, int r2, int c2) {
        if(r1 == r2)
            return;
        int loops = r2 - r1;
        int r = r1;
        int c = c1;
        int temp = matrix[r][c];
        while(loops > 0) {

            c = c + 1;
            while(c <= c2) {
                int temp2 = matrix[r][c];
                matrix[r][c] = temp;
                temp = temp2;
                c = c + 1;
            }
            c = c2;
            r = r + 1;
            while(r <= r2) {
                int temp2 = matrix[r][c];
                matrix[r][c] = temp;
                temp = temp2;
                r = r + 1;
            }
            r = r2;
            c = c - 1;
            while(c >= c1) {
                int temp2 = matrix[r][c];
                matrix[r][c] = temp;
                temp = temp2;
                c = c - 1;
            }
            c = c1;
            r = r - 1;
            while(r >= r1) {
                int temp2 = matrix[r][c];
                matrix[r][c] = temp;
                temp = temp2;
                r = r - 1;
            }
            r = r1;
            if(r == r1 && c == c1)
                loops--;

        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        new Solution().rotate(matrix);
    }
}