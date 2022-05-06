package problems1To100.problem5;

public class SolutionTest {

	public static void test() throws Exception {
		Solution solution = new Solution();
		String result = solution.longestPalindrome("ccc");
		if(!result.equals("ccc")) {
			throw new Exception("Test failed");
		}
	}

	public static void test2() throws Exception {
		Solution solution = new Solution();
		String result = solution.longestPalindrome("babad");
		if(!result.equals("bab")) {
			throw new Exception("Test failed");
		}
	}
	
	public static void test3() throws Exception {
		Solution solution = new Solution();
		String result = solution.longestPalindrome("a");
		if(!result.equals("a")) {
			throw new Exception("Test failed");
		}
	}
	
	public static void test4() throws Exception {
		Solution solution = new Solution();
		String result = solution.longestPalindrome("aacabdkacaa");
		if(!result.equals("aca")) {
			throw new Exception("Test failed");
		}
	}
	
	public static void main(String[] args) throws Exception {
		test();
		test2();
		test3();
		test4();
		System.out.println("Tests Passed");
	}
}
