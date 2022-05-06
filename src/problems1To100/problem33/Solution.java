package problems1To100.problem33;


class Solution {
	public int search(int[] nums, int target) {
		if(nums.length <= 2) {
			if(nums[0] == target) {
				return 0;
			} else if(nums[1] == target) {
				return 1;
			} else {
				return -1;
			}
		}
		int minValueIndex = 0;
		int res = -1;
		int l = 0, r = nums.length -1;
		while(l <= r) {
			if(nums[r] > nums[l]) {
				if(nums[l] < nums[minValueIndex]) {
					minValueIndex = l;
				}
				break;
			}
			int m = (int) Math.floor((l + r)/2);
			if(nums[minValueIndex] > nums[m]) {
				minValueIndex = m;
			}
			if(nums[m] >= nums[l]) {
				l = m + 1;
			} else {    
				r = m - 1;
			}
		}
		if(target == nums[minValueIndex]) {
			return minValueIndex;
		} 
		if(minValueIndex == 0) {
			l = 0;
			r = nums.length - 1;
		} else if (target > nums[0] && target <= nums[minValueIndex - 1]){
			l = 0;
			r = minValueIndex - 1;
		} else {
			l = minValueIndex;
			r = nums.length - 1;
		}
		while(l <= r) {
			int m = (int) Math.floor((l + r)/2);
			if(nums[m] == target) {
				res = m;
				break;
			}
			if(nums[m] > target) {
				r = m - 1;
			} else {
				l = m + 1;
			}
		}
		return res;
	}

	public static void main(String[] args) {
		int[] input = {3,1};
		int output = new Solution().search(input, 3);
		System.out.println(output);
	}
}