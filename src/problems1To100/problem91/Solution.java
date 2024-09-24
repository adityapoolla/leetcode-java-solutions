package problems1To100.problem91;
class Solution {
    public int numDecodings(String s) {
        int[] dp = new int[s.length()];
        return numDecodings(s, 0, dp);
    }

    private int numDecodings(String s, int start, int[] dp) {
        if(start == s.length()) return 1;
        if(s.charAt(start) == '0') return 0;
        if(dp[start] != 0) return dp[start];
        int count = numDecodings(s, start + 1, dp);
        if(start < s.length() - 1) {
            char ch = s.charAt(start);
            char next = s.charAt(start + 1);
            if(ch == '1' || (ch == '2' && '0' <= next && next <= '6')) {
                count += numDecodings(s, start + 2, dp);
            }
        }
        dp[start] = count;
        return count;
    }
}