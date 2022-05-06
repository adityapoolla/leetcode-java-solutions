package problems101To200.problem151;

class Solution {
	public int maxProduct(int[] nums) {
		int currentMax = 1, currentMin = 1;
		int maxProduct = nums[0];
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] == 0) {
				currentMax = 1;
				currentMin = 1;
				continue;
			}
			int temp = currentMax * nums[i];
			currentMax = Math.max(currentMax * nums[i], Math.max(currentMin * nums[i], nums[i]));
			currentMin = Math.min(temp, Math.min(currentMin * nums[i], nums[i]));
			
			maxProduct = Math.max(maxProduct, currentMax);
		}
		return maxProduct;
	}

	public static void main(String[] args) {
		int[] input = {2,-5,-2,-4,3};
		int output = new Solution().maxProduct(input);
		System.out.println(output);
		
		int[] input2 = {-2,-3,7};
		output = new Solution().maxProduct(input2);
		System.out.println(output);
	}
}