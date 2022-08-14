package problems101To200.problem125;

class Solution2 {
    public static boolean isPalindrome(String s) {
        int head = 0;
        int tail = s.length() - 1;
        while(head < tail) {
            Character hch = getValidChar(s.charAt(head));
            Character tch = getValidChar(s.charAt(tail));
            if(hch == null) {
                head++;
            } else if(tch == null) {
                tail--;
            } else if(hch != tch) {
                System.out.print("head "+ head + " tail "+ tail + " hch "+hch + " tch " + tch);
                return false;
            } else {
                head++;
                tail--;
            }
        }
        return true;
    }

    public static Character getValidChar(char ch) {
        ch = Character.toLowerCase(ch);
        if((ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9'))
            return ch;
        return null;
    }

    public static void main(String[] args) {
        boolean b = isPalindrome("A man, a plan, a canal: Panama");
        System.out.println(b);
    }

}
