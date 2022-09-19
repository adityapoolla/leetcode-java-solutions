package problems301To400.problem345;

class Solution {
    public String reverseVowels(String s) {
        char[] ch = s.toCharArray();
        int l = 0, r = ch.length - 1;
        while(l < r) {
            if(isVowel(ch[l]) && isVowel(ch[r])) {
                char temp = ch[r];
                ch[r] = ch[l];
                ch[l] = temp;
                l++;
                r--;
            }
            else if(isVowel(ch[l])) {
                r--;
            } 
            else if(isVowel(ch[r])) {
                l++;
            } 
            else {
                l++;
                r--;
            }  
        }
        return String.valueOf(ch);
    }
    
    public boolean isVowel(char ch) {
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            return true;
        else if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
            return true;
        return false;
    }
}