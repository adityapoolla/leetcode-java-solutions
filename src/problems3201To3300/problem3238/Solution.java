package problems3201To3300.problem3238;
class Solution {
    public int winningPlayerCount(int n, int[][] pick) {
        int[][] counts = new int[n][11];
        for(int i = 0; i < pick.length; i++) {
            int player = pick[i][0];
            int color = pick[i][1];
            counts[player][color]++;
        }
        int winners = 0;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < 11; j++) {
                if(counts[i][j] > i) {
                    winners++;
                    break;
                }
            }
        }
        return winners;
    }
}