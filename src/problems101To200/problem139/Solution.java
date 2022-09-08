package problems101To200.problem139;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    Map<String, Boolean> dictionary;
    public boolean wordBreak(String s, List<String> wordDict) {
        dictionary = new HashMap<>();
        for(String word: wordDict) {
            dictionary.put(word, true);
        }
        return solveWordBreak(s);
    }
    
    private boolean solveWordBreak(String s) {
        if(s.equals(""))
            return true;
        String trail = "";
        for(int i = 0; i < s.length(); i++) {
            trail += s.charAt(i);
            if(dictionary.get(trail) != null) {
                if(solveWordBreak(s.substring(i + 1))){
                    return true;
                } 
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String inp = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaab";
        List<String> list = List.of("a","aa","aaa","aaaa","aaaaa","aaaaaa","aaaaaaa","aaaaaaaa","aaaaaaaaa","aaaaaaaaaa");
        new Solution().wordBreak(inp, list);
    }
}