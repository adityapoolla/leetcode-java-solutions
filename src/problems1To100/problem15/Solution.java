package problems1To100.problem15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
    	List<List<Integer>> result = new ArrayList<>();
        
    	// sort the array
    	Arrays.sort(nums);
    	for(int i = 0; i < nums.length; i++) {
    		if(i > 0 && nums[i] == nums[i - 1]) {
    			continue;
    		}
    		int l = i + 1;
    		int r = nums.length - 1;
    		while(l < r) {
    			int sum = nums[i] + nums[l] + nums[r];
    			if(sum > 0) {
    				r -= 1;
    			} else if(sum < 0) {
    				l += 1;
    			} else {
    				List<Integer> res = new ArrayList<>();
    				res.add(nums[i]);
    				res.add(nums[l]);
    				res.add(nums[r]);
    				result.add(res);
    				l += 1;
    				while(nums[l] == nums[l - 1] && l < r) 
    					l +=1;
    			}
    		}
    	}
    	
    	return result;
    }
}