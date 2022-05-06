package problems101To200.problem153;

class Solution {
	public int findMin(int[] nums) {
        int minValue = nums[0];
        int l = 0, r = nums.length -1;
        while(l <= r) {
            if(nums[l] < nums[r]) {
                minValue = Math.min(nums[l], minValue);
                break;
            }
            int m = (int) Math.floor((l + r) / 2);
            minValue = Math.min(nums[m], minValue);
            if(nums[m] >= nums[l]) {
                l = m + 1;
            } else {
                r = m - 1;
            }
            
        }
        return minValue;
    }
    
    public static void main(String[] args) {
		int[] input = {3,1};
		int output = new Solution().findMin(input);
		System.out.println(output);
//		
//		int[] input2 = {-2,-3,7};
//		output = new Solution().findMin(input2);
//		System.out.println(output);
	}
}