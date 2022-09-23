package problems1401To1500.problem1431;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        for(int i : candies) 
            if(i > max)
                max = i;
        List<Boolean> result = new ArrayList<>();
        for(int i : candies) {
            if(i + extraCandies >= max)
                result.add(true);
            else 
                result.add(false);
        }
        return result;
    }
}