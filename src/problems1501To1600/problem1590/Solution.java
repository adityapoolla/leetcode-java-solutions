package problems1501To1600.problem1590;

import java.util.stream.IntStream;

class Solution {
	
	public static void main(String[] args) {
		Solution sol = new Solution();
		int ans = sol.minSubarray(new int[] {1000000000,1000000000,1000000000}, 3);
		System.out.println(ans);
	}
    public int minSubarray(int[] nums, int p) {
        double total = 0;
        for(int i = 0; i < nums.length; i++) total += nums[i];
        if((total % p) == 0) return 0;
        for(int i = 0; i < nums.length - 1; i++) {
            int w = minSubarray(nums, p, total, i);
            if(w != -1) return w;
        }
        return -1;
    }

    public int minSubarray(int[] nums, int p, double total, int windowWidth) {
        for(int i = 0; i < nums.length - windowWidth + 1; i++) {
            int sum = IntStream.rangeClosed(i, i + windowWidth - 1).map(k -> nums[k]).sum();
            if((total - sum) % p == 0) return windowWidth;
        }
        return -1;
    }
}