package problems201To300.problem290;
import java.util.HashMap;
import java.util.Objects;

public class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if (words.length != pattern.length()) {
            return false;
        }

        HashMap<Character, String> mp = new HashMap<>();
        for (int i = 0; i < words.length; ++i) {
            char ch = pattern.charAt(i);
            String word = words[i];
            if (mp.containsKey(ch)) {
                if (!Objects.equals(mp.get(ch), word)) {
                    return false;
                }
            } else if (mp.containsValue(word)) {
                return false;
            }

            mp.put(ch, word);
        }

        return true;
    }
}