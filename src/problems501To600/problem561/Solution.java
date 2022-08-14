package problems501To600.problem561;

import java.util.Arrays;

class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        int i = nums.length - 2;
        while(i >= 0) {
            sum += nums[i];
            i = i - 2;
        }
        return sum;   
    }
}