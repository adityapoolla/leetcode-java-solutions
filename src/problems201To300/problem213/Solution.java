package problems201To300.problem213;
class Solution {
    public int rob(int[] nums) {
        if(nums.length == 1) {
            return nums[0];
        }
        return Math.max(rob(0, nums.length - 1, nums),
        rob(1, nums.length, nums));
    }
    private int rob(int start, int end, int[] nums) {
        int rob1 = 0; 
        int rob2 = 0;
        for(int i = start; i < end; i++) {
            int temp = Math.max(nums[i] + rob1, rob2);
            rob1 = rob2;
            rob2 = temp;
        }
        return rob2;
    }
}