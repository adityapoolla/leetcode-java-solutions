package problems201To300.problem217;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer, Boolean> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
        	Boolean isDuplicate = map.get(nums[i]);
        	if(isDuplicate != null) {
        		return true;
        	} else {
        		map.put(nums[i], true);
        	}
        }
        return false;
    }
}