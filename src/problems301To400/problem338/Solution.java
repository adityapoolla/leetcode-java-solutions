package problems301To400.problem338;

class Solution {
    public int[] countBits(int n) {
        int res[] = new int[n + 1];
        res[0] = 0;
        if(n == 0)
            return res;
        res[1] = 1;
        for(int i = 2; i <= n; i++){
            if(i % 2 == 0)
                res[i] = res[i / 2];
            else
                res[i] =  1 + res[i  - 1];
        }
        return res;
    }
    
    
    public int[] countBits2(int n) {
    	int dp[] = new int[n + 1];
    	int offset = 1;
    	for(int i = 1; i <= n; i++) {
    		if(offset * 2 == i) offset = i;
    		dp[i] = 1 + dp[i - offset];
    	}
    	return dp;
    }
}