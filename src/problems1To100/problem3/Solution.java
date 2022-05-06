package problems1To100.problem3;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int start = 0, end = 0, longest = 0;
        for(end = 0; end < s.length(); end++) {
        	char ch = s.charAt(end);
        	Integer duplicateIndex = map.get(ch);
        	if(duplicateIndex != null) {
        		longest = end - start > longest ? end - start : longest;
        		for(int i = start; i <= duplicateIndex; i++) {
        			map.remove(s.charAt(i));
        		}
        		start = duplicateIndex + 1;
        	}
        	map.put(ch, end);
        }
        longest = end - start > longest ? end - start : longest;
        return longest;
    }
}