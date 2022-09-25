package problems1201To1300.problem1221;

class Solution {
    public int balancedStringSplit(String s) {
        int ls = 0, rs = 0, count = 0;
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch == 'L')
                ls++;
            else if(ch == 'R')
                rs++;
            if(ls == rs)
            {
                count++;
                ls = 0;
                rs = 0;
            }
        }
        return count;
    }
}