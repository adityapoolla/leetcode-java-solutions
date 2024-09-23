package problems401To500.problem500;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {

    Map<Character, Integer> map;

    public Solution() {
        map = new HashMap<>();
        for(int i = 0; i < 26; i++) {
            char ch = (char)('a' + i);
            int rn = rowNum(ch);
            map.put(ch, rn);
            ch = (char)('A' + i);
            map.put(ch, rn);
        }
    }
    public String[] findWords(String[] words) {
        List<String> result = new ArrayList<>();
        for(String word: words) {
            boolean same = true;
            int rown = map.get(word.charAt(0));
            for(int i = 1; i < word.length(); i++) {
                char ch = word.charAt(i);
                if(rown != map.get(ch)) {
                    same = false;
                    break;
                }
            }
            if(same) {
                result.add(word);
            }
        }
        return result.toArray(String[]::new);
    }

    private int rowNum(Character ch) {
        if("qwertyuiop".indexOf(ch) > -1) return 1;
        else if("asdfghjkl".indexOf(ch) > -1) return 2;
        else return 3; 
    }
}