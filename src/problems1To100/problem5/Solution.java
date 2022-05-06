package problems1To100.problem5;

import java.util.HashMap;
import java.util.Map;

public class Solution {
	public String longestPalindrome(String s) {
		String longestPalindrome = s.charAt(0) + "";
		int start = 0, end = 0;
		Map<Character, Integer> map = new HashMap<>();
		for(end = 0; end < s.length(); end++) {
			char ch = s.charAt(end);
			Integer duplicateIndex = map.get(ch);
			if(duplicateIndex != null) {
				String subStr = s.substring(duplicateIndex, end) + ch; 
				boolean isPalindrome = true;
				for(int i = 0; i < subStr.length()/2; i++) {
					if(subStr.charAt(i) != subStr.charAt(subStr.length() - i -1)) {
						isPalindrome = false;
					}
				}
				if(isPalindrome) {
					longestPalindrome = subStr.length() > longestPalindrome.length() ? subStr : longestPalindrome;
				} else {
					for(int i = start; i <= duplicateIndex; i++) {
						map.remove(s.charAt(i));
					}
					start = duplicateIndex + 1;
				}
			} else {
				map.put(ch, end);
			}
		}
		return longestPalindrome;
	}
}