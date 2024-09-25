package problems501To600.problem575;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public int distributeCandies(int[] candyType) {
        Set<Integer> set = new HashSet<>(candyType.length);
        for(int i = 0; i < candyType.length; i++) {
            set.add(candyType[i]);
            if(set.size() == candyType.length / 2) return set.size();
        }
        return set.size();
    }
}