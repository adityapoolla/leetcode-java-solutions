package problems201To300.problem238;

class Solution {
	public int[] productExceptSelf(int[] nums) {
		int[] results = new int[nums.length];
		results[0] = 1;
		for(int i = 1; i < nums.length; i++) {
			results[i] = nums[i - 1] * results[i - 1]; 
		}
		int postfix = 1;
		for(int i = nums.length - 2; i >= 0; i --) {
			postfix = postfix * nums[i + 1];
			results[i] = results[i] * postfix;
		}
		return results;
	}

	public static void main(String[] args) {
		int[] input = {1,2,3,4};
		int[] output = new Solution().productExceptSelf(input);
		for(int i = 0; i < output.length; i++) {
			System.out.print(output[i] + ", ");;
		}
	}
}