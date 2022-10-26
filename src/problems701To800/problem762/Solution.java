package problems701To800.problem762;

class Solution {
    public int countPrimeSetBits(int left, int right) {
        int count = 0;
        for(int i = left; i <= right; i++) {
            if(isCountSetBitsPrime(i)) 
                count++;
        }
        return count;
    }
    
    private boolean isCountSetBitsPrime(int n) {
        int numberOfSetBits = getSetBitscount(n);
        return isPrime(numberOfSetBits);
    }
    
    private int getSetBitscount(int n) {
        int ones = 0;
        while(n > 0) {
            if(n % 2 == 1)
                ones++;
            n /= 2;
        }
        return ones;
    }
    
    private boolean isPrime(int n) {
        if(n == 2 || n == 3 || n == 5
          || n == 7 || n == 11 || n == 13
          || n == 17 || n == 19)
            return true;
        return false;
    }
}