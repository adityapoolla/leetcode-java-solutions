package problems301To400.problem389;

class Solution {
    public char findTheDifference(String s, String t) {
        int[] chars = new int[26];
        for(int i = 0; i < s.length(); i++) {
            chars[s.charAt(i) - 'a']++;
        }
        
        for(int i = 0; i < t.length(); i++) {
            chars[t.charAt(i) - 'a']--;
        }
        
        for(int i = 0; i < chars.length; i++) {
            if(chars[i] == -1)
                return (char)('a'+ i);
        }
        return ' ';
    }
}