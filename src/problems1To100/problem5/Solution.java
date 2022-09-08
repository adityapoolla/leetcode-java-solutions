package problems1To100.problem5;

import java.util.HashMap;
import java.util.Map;
class Solution {
	public static String longestPalindrome(String s) {
		int start = 0;
		int end = 0;
		for(int i = 0; i < s.length(); i++) {
			// mid is i check left and right if it is a palindrome
			int l = i - 1;
			int r = i + 1;
			int count = 1;
			while(l > -1 && r < s.length()) {
				if(s.charAt(l) == s.charAt(r)) {
					count += 2;
					l--;
					r++;
				} else {
					break;
				}
			}
			if(count > end - start + 1) {
				start = l + 1;
				end = r - 1;
			}
		}
		return s.substring(start, end + 1);
	}

	public static void main(String[] args) {
		System.out.println(longestPalindrome("babad"));
	}
}