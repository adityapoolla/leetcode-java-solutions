package problems201To300.problem283;

class Solution {
    public void moveZeroes(int[] nums) {
        int zeroIndex = -1;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 0 && zeroIndex == -1)
                zeroIndex = i;
            else if(nums[i] == 0)
                continue;
            else if(zeroIndex != -1){
                nums[zeroIndex] = nums[i];
                nums[i] = 0;
                zeroIndex++;
            } else 
                continue;
        }
    }
}