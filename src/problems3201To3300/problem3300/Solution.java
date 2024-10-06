package problems3201To3300.problem3300;

import java.util.List;
import java.util.stream.IntStream;

class Solution {
    public int minElement(int[] nums) {
        return IntStream.of(nums).map(i -> elementSum(i)).min().orElse(0);
    }

    private int elementSum(int num) {
        return List.of(String.valueOf(num).split("")).stream()
        .mapToInt(i -> Integer.valueOf(i)).sum();
    }
}