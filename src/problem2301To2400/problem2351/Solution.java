package problem2301To2400.problem2351;
class Solution {
    public char repeatedCharacter(String s) {
        int[] store = new int[26];
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(store[ch - 'a'] > 0)
                return ch;
            else 
                store[ch - 'a']++;
        }
        return 'A';
    }
}
