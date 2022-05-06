package problems1To100.problem53;
//https://leetcode.com/problems/maximum-subarray/

class Solution {
    public int maxSubArray(int[] nums) {
    	int maxValue = nums[0];
    	int currentSum = 0;
    	for(int end = 0; end < nums.length; end++) {
    		if(currentSum < 0) {
    			currentSum = 0;
    		}
    		currentSum += nums[end];
    		if(currentSum > maxValue) {
    			maxValue = currentSum;
    		}
    	}
    	return maxValue;
    }
    
    public static void main(String[] args) {
    	int[] input = {-2,1,-3,4,-1,2,1,-5,4};
		System.out.println(new Solution().maxSubArray(input));
	}
}


