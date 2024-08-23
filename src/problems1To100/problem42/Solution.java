package problems1To100.problem42;
class Solution {
    public int trap(int[] height) {
        int result = 0;
        int l = 0, r = height.length - 1;
        int lMax = height[l];
        int rMax = height[r];

        while(l < r) {
            if(lMax < rMax) {
                l++;
                lMax = Math.max(lMax, height[l]);
                result += lMax - height[l];
            } else {
                r--;
                rMax = Math.max(rMax, height[r]);
                result += rMax - height[r];
            }
        }

        return result;
    }
}