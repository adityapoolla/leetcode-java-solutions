package problems501To600.problem557;

class Solution {
	public String reverseWords(String s) {
		StringBuilder sb = new StringBuilder();
		String[] inputArr = s.split(" ");
		for (int i = 0; i < inputArr.length; i++) {
			sb.append(reverse(inputArr[i]));
			if (i != inputArr.length - 1) {
				sb.append(" ");
			}
		}
		return sb.toString();
	}

	private String reverse(String s) {
		StringBuilder input1 = new StringBuilder();
		input1.append(s);
		return input1.reverse().toString();
	}
}