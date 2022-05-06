package problems1To100.problem1;

public class SolutionTest {

	public static void test() throws Exception {
		Solution solution = new Solution();
		int[] input = {2,7,11,15};
		int[] result = solution.twoSum(input, 9);
		if(result[0] != 0 || result[1] != 1) {
			throw new Exception("Test Failed");
		}
		
	}
	
	public static void main(String[] args) throws Exception {
		test();
		System.out.println("Tests Passed");
	}
}
