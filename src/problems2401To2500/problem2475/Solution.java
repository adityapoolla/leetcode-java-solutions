package problems2401To2500.problem2475;

class Solution {
    public int unequalTriplets(int[] nums) {
        int count = 0;
        for(int i = 0; i < nums.length; i++) {
            for(int j = i; j < nums.length; j++) {
                for(int k = j; k < nums.length; k++) {
                    if(nums[i] != nums[j] && nums[j] != nums[k] && nums[k] != nums[i])
                    count++;
                }
            }
        }
        return count;
    }
}