package problems101To200.problem139;

import java.util.List;

class Solution2 {
    public boolean wordBreak(String s, List<String> wordDict) {
        int slen = s.length(); 
        boolean[] dp = new boolean[slen + 1];
        dp[slen] = true;
        for(int i = slen - 1; i > -1; i--) {
            for(String word : wordDict) {
                if(slen - i >= word.length()) {
                    String sub = s.substring(i);
                    if(sub.indexOf(word) == 0) {
                        dp[i] = dp[i + word.length()];
                    }
                    if(dp[i]) {
                        break;
                    }
                }
            }
        }
        return dp[0];
    }
}