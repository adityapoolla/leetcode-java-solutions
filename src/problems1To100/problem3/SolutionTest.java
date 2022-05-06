package problems1To100.problem3;

public class SolutionTest {

	public static void test() throws Exception {
		Solution solution = new Solution();
		int result = solution.lengthOfLongestSubstring("pwwkew");
		if(result != 3) {
			throw new Exception("Test failed");
		}
	}
	
	public static void test2() throws Exception {
		Solution solution = new Solution();
		int result = solution.lengthOfLongestSubstring("aabaab!bb");
		if(result != 3) {
			throw new Exception("Test failed");
		}
	}
	public static void main(String[] args) throws Exception {
		test();
		test2();
		System.out.println("Tests Passed");
	}
}
