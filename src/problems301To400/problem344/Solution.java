package problems301To400.problem344;

class Solution {
    public void reverseString(char[] s) {
        int len = s.length;
        int mid = len/2;
        for(int i = 0; i < mid; i++) {
            char temp = s[i];
            s[i] = s[len - i - 1];
            s[len - i - 1] = temp;
        }
    }
}