package problems401To500.problem409;

class Solution {
    public int longestPalindrome(String s) {
        int[] charCount = new int[60];
        for(int i = 0; i < s.length(); i++) 
            charCount[s.charAt(i) - 'A'] += 1;
        int result = 0;
        int oddCount = 0;
        for(int i = 0; i < charCount.length; i++){
            if(charCount[i] % 2 == 0)
                result += charCount[i];
            else {
                result = result + charCount[i] - 1;
                oddCount++;
            }    
        }
        if(oddCount > 0)
            return result + 1;
        return result;
    }
}