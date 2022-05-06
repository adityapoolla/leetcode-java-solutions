package problems1To100.problem1;

import java.util.HashMap;
import java.util.Map;

// https://leetcode.com/problems/two-sum/
public class Solution {
	
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
        	if(map.get(nums[i]) != null) {
        		int[] result = {map.get(nums[i]), i};
        		return result;
        	} else {
        		map.put(target - nums[i], i);
        	}
        }
        return null;
    }
    
}
