package problems301To400.problem303;

class NumArray {

    int[] M;
    public NumArray(int[] nums) {
        int n = nums.length;
        M = new int[n];
        M[0] = nums[0];
        for(int i = 1; i < n; i++){
            M[i] = M[i - 1] + nums[i];
        }
    }
    
    public int sumRange(int left, int right) {
        if(left == 0) return M[right];
        return M[right] - M[left - 1];
    }
}
