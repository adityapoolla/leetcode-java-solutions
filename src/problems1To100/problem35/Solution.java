package problems1To100.problem35;

class Solution {
    public static int searchInsert(int[] nums, int target) {
        int position = -1;
        int l = 0; 
        int r = nums.length - 1;
        if(target > nums[r]) {
        	return r + 1;
        } else if(target < nums[l]) {
        	return 0;
        }
        while(l <= r) {
        	int mid = (l + r) / 2;
        	if(nums[mid] == target) {
        		position = mid;
        		break;
        	} else if(nums[mid] < target) {
        		l = mid + 1;
        	} else {
        		r = mid - 1;
        	}
        }
        if(position == -1) {
        	if(nums[l] < target) {
        		position = l + 1;
        	} else {
        		position = l;
        	}
        }
        return position == -1 ? 0: position;
    } 
    
    public static void main(String[] args) {
		int[] a = {1,3,5,6};
		System.out.println(searchInsert(a, 2));
		
	}
}