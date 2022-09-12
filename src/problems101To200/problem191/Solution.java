package problems101To200.problem191;

public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int ones = 0;
        for(int i = 0; i < 32; i++) {
            if((n & 1) == 1)
                ones++;
            n = n >> 1;
        }
        return ones;
    }
}