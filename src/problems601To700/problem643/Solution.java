package problems601To700.problem643;
class Solution {
	public static void main(String[] args) {
		double ans = new Solution().findMaxAverage(new int[] {-1}, 1);
		System.out.println(ans);
	}
    public double findMaxAverage(int[] nums, int k) {

    	double maxAvg = 0;
    	double sum = 0;
    	for(int i = 0; i < k; i++) {
    		sum += nums[i];
    	}
    	maxAvg = sum / k;    	
        for(int i = 1; i <= nums.length - k; i++) {
            sum = sum - nums[i - 1] + nums[i + k - 1];
            double avg = sum / k;
            maxAvg = Math.max(maxAvg, avg);
        }
        return maxAvg;
   
    }
}