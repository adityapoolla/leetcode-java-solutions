package problems201To300.problem231;

class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n < 1)
            return false;
        if((n & (n - 1)) == 0)
            return true;
        return false;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().isPowerOfTwo((int)Math.pow(2, 10)));
        System.out.println(new Solution().isPowerOfTwo(15));
    }
}
