package problems1To100.problem34;
class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        int position = binarySearch(nums,0, nums.length, target);
        int low = position, high = position;
        int newLow = low - 1;
        while(newLow >= 0 && nums[newLow] == target) {
            low = newLow;
            newLow--;
        }
        int newHigh = high + 1;
        while(newHigh < nums.length && nums[newHigh] == target) {
            high = newHigh;
            newHigh++;
        }
        int[] result = {low, high};
        return result;
        
    }
    
    public static int binarySearch(int[] nums,int l, int h, int target) {
        if(l < h) {
            int mid = (l + h) / 2;
            if(nums[mid] == target) {
                return mid;
            }
            else if(nums[mid] < target) {
                return binarySearch(nums, mid + 1, h, target);
            } else {
                return binarySearch(nums, l, mid, target);
            }
        } else {
            return -1;
        }
    }
}