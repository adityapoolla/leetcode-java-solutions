package problems3201To3300.problem3300;

import java.util.List;
import java.util.stream.IntStream;

public class Solution {
    public int minElement(int[] nums) {
        return IntStream.of(nums).map(i -> elementSum(i)).min().orElse(0);
    }

    private int elementSum(int num) {
        return List.of(String.valueOf(num).split("")).stream()
        .mapToInt(i -> Integer.valueOf(i)).sum();
    }
}

class Solution2 {
    public int minElement(int[] nums) {
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int sum = 0;
            while(num != 0) {
                sum = sum + num % 10;
                num = num / 10;
            }
            if(sum < min) min = sum;
        }   
        return min;
    }
}