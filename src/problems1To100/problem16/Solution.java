package problems1To100.problem16;

import java.util.Arrays;

class Solution {
    public int threeSumClosest(int[] nums, int target) {
    	Arrays.sort(nums);
    	int closestSum = nums[0] + nums[1] + nums[2];
    	int abs = Math.abs(target - closestSum);
    	for(int i = 0; i < nums.length; i++) {
    		if(i > 0 && nums[i] == nums[i - 1]) 
    			continue;
    		int l = i + 1;
    		int r = nums.length - 1;
    		while(l < r) {
    			int sum = nums[i] + nums[l] + nums[r];
    			if(Math.abs(target - sum) < abs) {
    				closestSum = sum;
    			}
    			if(sum < target) {
    				l++;
    			} else {
    				r--;
    			}
    		}
    		
    	}
		return closestSum;
    }
    
}