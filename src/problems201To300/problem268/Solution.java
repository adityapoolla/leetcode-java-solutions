package problems201To300.problem268;

class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int total = n * (n + 1) / 2;
        int arrTotal = 0;
        for(int num: nums) {
            arrTotal += num;
        }
        
        return total - arrTotal;
    }
    
    private int missingNumber2(int[] nums) {
        int result = 0;
        for(int i = 0; i < nums.length; i++) {
            result ^= nums[i];
        }
        for(int i = 0; i <= nums.length; i++) {
            result ^= i;
        }
        return result;
    }
}