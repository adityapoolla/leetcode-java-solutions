package problems1To100.problem42;
class Solution2 {
    public int trap(int[] height) {
        int rainwater = 0;
        int[] left = new int[height.length];
        int[] right = new int[height.length];
        for(int i = 1; i < left.length; i++) {
            left[i] = Math.max(left[i - 1], height[i - 1]);
        }
        for(int i = right.length - 2; i > -1; i--) {
            right[i] = Math.max(right[i + 1], height[i + 1]);
        }
        for(int i = 0; i < height.length; i++) {
            int atpos = Math.min(left[i], right[i]);
            if(atpos > height[i]) {
                atpos = atpos - height[i];
                rainwater = rainwater + atpos;
            }
        }
        return rainwater;
    }
}