package problems601To700.problem628;
class Solution {
    public int maximumProduct(int[] nums) {

        // O(n log n)

        // Arrays.sort(nums);

        // int i = nums.length;

        // int max1 = nums[i - 1] * nums[i - 2] * nums[i - 3];
        // int max2 = nums[0] * nums[1] * nums[i - 1];

        // if (max1 > max2)
        //     return max1;

        // return max2;    


        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE;

        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        for (int n : nums) {

            if (n > max1) {
                max3 = max2;
                max2 = max1;
                max1 = n;
            } else if (n > max2) {
                max3 = max2;
                max2 = n;
            } else if(n > max3) {
                max3 = n;
            }

            if (n < min1) {
                min2 = min1;
                min1 = n;
            } else if (n < min2) {
                min2 = n;
            }

        }

        return Math.max(max1 * max2 * max3, max1 * min1 * min2);

    }
}