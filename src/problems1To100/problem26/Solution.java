package problems1To100.problem26;
class Solution {
    public int removeDuplicates(int[] nums) {
        int k = nums.length;
        int ptr = 0;
        for(int i = 0; i < nums.length; i++) {
            if(i > 0 && nums[i] == nums[i-1]) {
                // duplicate
                k--;
                continue;
            } else {
                nums[ptr] = nums[i];
                ptr++;
            }
        }
        return k;
    }
}