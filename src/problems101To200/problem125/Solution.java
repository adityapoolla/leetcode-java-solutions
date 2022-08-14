package problems101To200.problem125;

class Solution {
    public static boolean isPalindrome(String s) {
        String rs = "";
        String revRs = "";
        s = s.toLowerCase();
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if((ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9')) {
                rs = ch + rs;
                revRs = revRs + ch;
            }
        }
        System.out.println(rs);
        System.out.println(revRs);
        return rs.equals(revRs);
    }

    public static void main(String[] args) {
        boolean b = isPalindrome("A man, a plan, a canal: Panama");
        System.out.println(b);
    }
}