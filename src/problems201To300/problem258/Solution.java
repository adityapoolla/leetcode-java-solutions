package problems201To300.problem258;

class Solution {
    public int addDigits(int num) {
        if(num < 10)
            return num;
        int i = 0;
        while(num != 0) {
            int k = num % 10;
            i += k;
            num = num / 10;
        }
        return addDigits(i);
    }
}