package problems1To100.problem27;
class Solution {
    public int removeElement(int[] nums, int val) {
        int k = nums.length;
        int ptr = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == val) {
                k--;
            } else {
                nums[ptr] = nums[i];
                ptr++;
            }
        }
        return k;
    }
}