package problems401To500.problem414;

class Solution {
    public int thirdMax(int[] nums) {
        long[] maxnums = new long[3];
        maxnums[0] = Long.MIN_VALUE;
        maxnums[1] = Long.MIN_VALUE;
        maxnums[2] = Long.MIN_VALUE;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == maxnums[0] || nums[i] == maxnums[1] || nums[i] == maxnums[2])
                continue;
            if(nums[i] > maxnums[0]) {
                maxnums[2] = maxnums[1];
                maxnums[1] = maxnums[0];
                maxnums[0] = nums[i];
            } 
            else if(nums[i] > maxnums[1]) {
                maxnums[2] = maxnums[1];
                maxnums[1] = nums[i];
            }
            else if(nums[i] > maxnums[2]) {
                maxnums[2] = nums[i];
            }
        }
        if(maxnums[2] < Integer.MIN_VALUE)
            return (int)maxnums[0];
        return (int)maxnums[2];
    }
}