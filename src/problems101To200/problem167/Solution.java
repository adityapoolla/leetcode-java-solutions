package problems101To200.problem167;

public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int l = 0;
        int r = numbers.length - 1;
        while(l < r) {
        	if(numbers[l] + numbers[r] > target) {
        		r -= 1;
        	} else if( numbers[l] + numbers[r] < target) {
        		l += 1;
        	} else {
        		break;
        	}
        }
        int[] result = {l + 1, r + 1};
        return result;
    }
}