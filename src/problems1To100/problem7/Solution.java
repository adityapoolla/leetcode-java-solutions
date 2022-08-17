package problems1To100.problem7;

class Solution {
    public static int reverse(int x) {
        //[-2147483648 to 2147483647]
        if(x == 0)
            return 0;
        boolean isNegative = false;
        long result = 0;
        if(x < 0) {
            isNegative = true;
            x = -x;
        }
        
        while(x > 0) {
            int temp = x % 10;
            result = 10 * result + temp;
            x = x / 10;
        }
        if(result > Integer.MAX_VALUE)
            return 0;
        if(result < Integer.MIN_VALUE)
            return 0;
        if(isNegative)
            return (int)-result;
        return (int)result;
        
    }

    public static void main(String[] args) {
        System.out.println(Integer.MIN_VALUE);
        System.out.println(reverse(Integer.MIN_VALUE));
    }
}