package problems601To700.problem661;
class Solution {
    public int[][] imageSmoother(int[][] img) {
        int[][] result = new int[img.length][img[0].length];
        for(int i = 0; i < img.length; i++) {
            for(int j = 0; j < img[0].length; j++) {
                int count = 1;
                int sum = img[i][j];
                if(i - 1 > -1) {
                    count++;
                    sum += img[i - 1][j];
                }
                if(i + 1 < img.length) {
                    count++;
                    sum += img[i + 1][j];
                }
                if(j - 1 > -1) {
                    count++;
                    sum += img[i][j - 1];
                }
                if(j + 1 < img[0].length) {
                    count++;
                    sum += img[i][j + 1];
                }
                if(i - 1 > -1 && j - 1 > -1) {
                    count++;
                    sum += img[i - 1][j - 1];
                }
                if(i - 1 > -1 && j + 1 < img[0].length) {
                    count++;
                    sum += img[i - 1][j + 1];
                }
                if(i + 1 < img.length && j - 1 > -1) {
                    count++;
                    sum += img[i + 1][j - 1];
                }
                if(i + 1 < img.length && j + 1 <img[0].length) {
                    count++;
                    sum += img[i + 1][j + 1];
                }
                int avg = (int)Math.floor(sum/count);
                result[i][j] = avg;

            }
        }
        return result;
    }
}