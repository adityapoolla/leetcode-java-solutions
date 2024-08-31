package problems201To300.problem300;
class Solution {
    public int lengthOfLIS(int[] nums) {
        int[] LIS = new int[nums.length];
        LIS[nums.length - 1] = 1;
        for(int i = nums.length - 1; i >= 0; i--) {

            int lisOfI = 1;
            for(int j = i + 1; j < nums.length; j++) {
                if(nums[j] > nums[i]) {
                    lisOfI = Math.max(lisOfI, 1 + LIS[j]);
                }
            }
            LIS[i] = lisOfI;
        }

        int max = Integer.MIN_VALUE;
        for(int i = 0; i < LIS.length; i++) {
            if(LIS[i] > max) {
                max = LIS[i];
            }
        }
        return max;
    }
}