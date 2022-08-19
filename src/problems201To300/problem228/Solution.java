package problems201To300.problem228;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();
        if(nums.length == 0)
            return result;
        String start = "" + nums[0];
        for(int i = 1; i < nums.length; i++) {
            if(nums[i] == nums[i - 1] + 1) {
                continue;
            } else {
                if(Integer.parseInt(start) != nums[i - 1]) {
                    start = start + "->" + nums[i - 1];
                }
                result.add(start);
                start = "" + nums[i];
            }
        }
        if(Integer.parseInt(start) != nums[nums.length - 1]) {
            start = start + "->" + nums[nums.length - 1];
        }
        result.add(start);
        return result;
    }
}