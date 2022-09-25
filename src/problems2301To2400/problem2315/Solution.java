package problems2301To2400.problem2315;

class Solution {
    public int countAsterisks(String s) {
        boolean pair = false;
        int count = 0;
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch == '|')
                pair = !pair;
            if(!pair && ch == '*')
                count++;
        }
        return count;
    }
}