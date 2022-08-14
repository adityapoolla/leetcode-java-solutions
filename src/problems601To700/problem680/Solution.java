package problems601To700.problem680;

class Solution {

    public static boolean validPalindrome(String s) {
        return validPalindrome(s, false);
    }
    public static boolean validPalindrome(String s, boolean isSkipped) {
        int l = 0;
        int r = s.length() - 1;
        while(l <= r) {
            if(s.charAt(l) != s.charAt(r)) {
                if(isSkipped) return false;
                return validPalindrome(s.substring(l, r), true)
                        || validPalindrome(s.substring(l + 1, r + 1), true);
            }
            l++;
            r--;
        }
        return true;
    }

    public static void main(String[] args) {

        boolean bool = validPalindrome("malayalamk");
        System.out.println(bool);
    }
}