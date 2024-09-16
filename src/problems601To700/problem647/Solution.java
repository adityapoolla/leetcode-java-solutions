package problems601To700.problem647;



class Solution {
    public int countSubstrings(String s) {
        int count = 0;
        for(int i = 0; i < s.length(); i++) {
            int l = i, r = i;
            while(l > -1 && r < s.length()) {
                if(s.charAt(l) == s.charAt(r)) {
                    count++;
                    l--;
                    r++;
                } else {
                    break;
                }
            }
        }
        for(int i = 0; i < s.length(); i++) {
            int l = i, r = i + 1;
            while(l > -1 && r < s.length()) {
                if(s.charAt(l) == s.charAt(r)) {
                    count++;
                    l--;
                    r++;
                } else {
                    break;
                }
            }
        }
        return count;
        
    }
}