package problems1901To2000.problem1996;

import java.util.Arrays;
import java.util.stream.Stream;

class Solution {
    public int numberOfWeakCharacters(int[][] properties) {
        Arrays.sort(properties, (a, b) -> a[0] == b[0] ? a[1] - b[1] : b[0] - a[0]);

        Stream.of(properties).forEach((int[] i) -> System.out.println(i[0] + " ," + i[1]));

        return -1;
    }

    public static void main(String[] args) {
        Solution soltuio = new Solution();
        int[][] properties = {{1, 1}, {2,2}, {2,1}, {1, 2}};
        soltuio.numberOfWeakCharacters(properties);
    }
}