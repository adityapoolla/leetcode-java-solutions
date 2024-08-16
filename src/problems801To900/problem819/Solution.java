package problems801To900.problem819;

import java.util.List;
import java.util.Map;
import java.util.HashMap;

class Solution {

    public String mostCommonWord(String paragraph, String[] banned) {
        paragraph = paragraph.replaceAll("[!?',;.]", " ");
        paragraph = paragraph.toLowerCase();
        Map<String, Boolean> bannedMap = new HashMap<>();
        for(String banWord : banned) {
            bannedMap.put(banWord, true);
        }
        Map<String, Integer> countMap = new HashMap<>();
        String[] words = paragraph.split(" ");
        List<Character> symbols = List.of('!', '?', '\'', ',', ';', '.');
        for(int i = 0; i < words.length; i++) {
          
            // sanitize word
            // remove the spaces and symbols
            String word = words[i];
            if(word.isEmpty()) {
                continue;
            }
            word = word.trim();
            //dont add the word if its banned
            if(bannedMap.get(word) != null) {
                continue;
            }
            // put in a map incrementing count
            if(countMap.get(word) != null) {
                countMap.put(word, countMap.get(word) + 1);
            }
            else {
                countMap.put(word, 1);
            }
        }

        String result = null;
        int count = 0;
        for(Map.Entry<String, Integer> entry: countMap.entrySet()) {
            if(entry.getValue() > count) {
                result = entry.getKey();
                count = entry.getValue();
            }
        }
        return result;
    }
}