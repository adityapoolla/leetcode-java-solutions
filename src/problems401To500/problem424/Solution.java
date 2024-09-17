package problems401To500.problem424;

class Solution {
    public int characterReplacement(String s, int k) {
        int l = 0, r = 0, maxLength = 0, maxFreq = 0;
        int[] frequency = new int[26];
        while(l <= r && r < s.length()) {
            char ch = s.charAt(r);
            maxFreq = Math.max(maxFreq, ++frequency[ch - 'A']);
            if(r - l + 1 - maxFreq <= k) {
                maxLength = Math.max(maxLength, r - l + 1);
            } else {
                frequency[s.charAt(l) - 'A']--;
                l++;
            }
            r++;
        }
        return maxLength;
    
    }
}