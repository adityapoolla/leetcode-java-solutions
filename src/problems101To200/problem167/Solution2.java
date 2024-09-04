package problems101To200.problem167;
class Solution2 {
    public int[] twoSum(int[] numbers, int target) {
        int small = 0;
        int large = numbers.length - 1;

        while(small < large) {
            int sum = numbers[small] + numbers[large];
            if(sum == target) {
                return new int[] {small + 1, large + 1};
            }
            else if(sum < target) {
                small++;
            } else {
                large--;
            }
        }
        return new int[] {-1, -1};
    }
}