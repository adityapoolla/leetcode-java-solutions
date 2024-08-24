package problems1To100.problem33;

class Solution {
	public int search(int[] nums, int target) {
		if (nums.length <= 2) {
			if (nums[0] == target) {
				return 0;
			} else if (nums[1] == target) {
				return 1;
			} else {
				return -1;
			}
		}
		int minValueIndex = 0;
		int res = -1;
		int l = 0, r = nums.length - 1;
		while (l <= r) {
			if (nums[r] > nums[l]) {
				if (nums[l] < nums[minValueIndex]) {
					minValueIndex = l;
				}
				break;
			}
			int m = (int) Math.floor((l + r) / 2);
			if (nums[minValueIndex] > nums[m]) {
				minValueIndex = m;
			}
			if (nums[m] >= nums[l]) {
				l = m + 1;
			} else {
				r = m - 1;
			}
		}
		if (target == nums[minValueIndex]) {
			return minValueIndex;
		}
		if (minValueIndex == 0) {
			l = 0;
			r = nums.length - 1;
		} else if (target > nums[0] && target <= nums[minValueIndex - 1]) {
			l = 0;
			r = minValueIndex - 1;
		} else {
			l = minValueIndex;
			r = nums.length - 1;
		}
		while (l <= r) {
			int m = (int) Math.floor((l + r) / 2);
			if (nums[m] == target) {
				res = m;
				break;
			}
			if (nums[m] > target) {
				r = m - 1;
			} else {
				l = m + 1;
			}
		}
		return res;
	}

	public static void main(String[] args) {
		int[] input = { 3, 1 };
		int output = new Solution().search(input, 3);
		System.out.println(output);

		Solution2 sol2 = new Solution2();
		System.out.println(sol2.search(new int[] { 4, 5, 6, 7, 0, 1, 2 }, 0));

		System.out.println(sol2.search(new int[] { 4, 5, 6, 7, 0, 1, 2 }, 5));
		System.out.println(sol2.search(new int[] { 1 }, 0));
	}
}

//Example 1:
//
//Input: nums = [4,5,6,7,0,1,2], target = 0
//               0,1,2,3,4,5,6
//Output: 4
//Example 2:
//
//Input: nums = [4,5,6,7,0,1,2], target = 3
//Output: -1
//Example 3:
//
//Input: nums = [1], target = 0
//Output: -1

class Solution2 {
	public int search(int[] nums, int target) {
		int k = 0;
		for (int i = nums.length - 1; i > 0; i--) {
			if (nums[i - 1] > nums[i]) {
				k = i - 1;
				break;
			}
		}
		if (nums[k] == target) {
			return k;
		} else if (nums[0] <= target && nums[k] >= target) {
			return binarySearch(nums, target, 0, k);
		} else {
			return binarySearch(nums, target, k + 1, nums.length - 1);
		}
	}

	private int binarySearch(int[] nums, int target, int l, int r) {
		if (l > r || l == r && nums[l] != target) {
			return -1;
		}
		int mid = l + (r - l) / 2;
		if (nums[mid] == target) {
			return mid;
		} else if (nums[mid] > target) {
			return binarySearch(nums, target, l, mid - 1);
		} else {
			return binarySearch(nums, target, mid + 1, r);
		}
	}
}