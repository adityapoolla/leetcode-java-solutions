package problems1To100.problem15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution2 {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();

        for(int i = 0; i < nums.length; i++) {
            if(i != 0 && nums[i] == nums[i - 1]) continue;
            int j = i + 1;
            int k = nums.length - 1;
            while(j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if(sum < 0) {
                    j++;
                } else if(sum > 0) {
                    k--;
                } else {
                    List<Integer> l = List.of(nums[i], nums[j], nums[k]);
                    result.add(l);
                    j++;
                    while(nums[j] == nums[j - 1] && j < k) j++;
                }
            }
        }

        return result;
    }
}
