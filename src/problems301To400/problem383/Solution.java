package problems301To400.problem383;

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] count = new int[26];
        for(int i = 0;  i < magazine.length(); i++) {
            char ch = magazine.charAt(i);
            count[ch - 'a']++;
        }
        
        for(int i = 0; i < ransomNote.length(); i++) {
            char ch = ransomNote.charAt(i);
            int index = (int)(ch - 'a');
            if(count[index] == 0)
                return false;
            count[index]--;
        }
        return true;
    }

    public static void main(String[] args) {
        new Solution().canConstruct("aab", "baa");
    }
}