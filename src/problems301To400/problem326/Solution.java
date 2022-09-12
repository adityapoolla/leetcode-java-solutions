package problems301To400.problem326;

class Solution {
    public boolean isPowerOfThree(int n) {
        if(n < 1)
            return false;
        int k = 1;
        for(int i = 0; i < 32; i++) {
            if(k == n)
                return true;
            k *= 3;
        }
        return false;
    }

    public boolean isPowerOfThree2(int n) {
        if(n < 1)
            return false;
        if(n == 1)
            return true;
        if(n % 3 == 0)
            return isPowerOfThree2(n / 3);
        return false;
    }
}