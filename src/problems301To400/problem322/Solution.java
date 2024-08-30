package problems301To400.problem322;
class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        for(int i = 0; i < dp.length; i++) {
            dp[i] = amount + 1;
        }

        dp[0] = 0;
        for(int i = 1; i < dp.length; i++) {
            for(int j = 0; j < coins.length; j++) {
                if(i - coins[j] < 0) {
                    continue;
                }
                dp[i] = Math.min(dp[i], 1 + dp[i - coins[j]]);
            }
        }

        if(dp[amount] == amount + 1) {
            return -1;
        } else {
            return dp[amount];
        }
    }
}