package problems1To100.problem18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        for(int i = 0; i < nums.length - 1; i++) {
        	if(i > 0 && nums[i] == nums[i-1]) 
        		continue;
        	for(int j = i + 1; j < nums.length - 1; j++) {
        		if(j > i + 1 && nums[j] == nums[j-1]) 
        			continue;
        		int l = j + 1;
        		int r = nums.length - 1;
        		while (l < r) {
        			int sum = nums[i] + nums[j] + nums[l] + nums[r];
        			if(sum < target) {
        				l++;
        				while(nums[l] == nums[l-1]) 
        					l++;
        			} else if (sum > target) {
        				r--;
        				while(nums[r] == nums[r+1])
        					r--;
        			} else {
        				List<Integer> quadri = new ArrayList<Integer>();
        				quadri.add(nums[i]);
        				quadri.add(nums[j]);
        				quadri.add(nums[l]);
        				quadri.add(nums[r]);
        				res.add(quadri);
        				l++;
        				while(nums[l] == nums[l-1]) 
        					l++;
        			}
        		}
        	}
        }
        return res;
    }
}