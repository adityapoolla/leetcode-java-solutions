package problems701To800.problem771;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        Map<Character, Boolean> map = new HashMap<>();
        for(int i = 0; i < jewels.length(); i++) {
            map.put(jewels.charAt(i), true);
        }
        int count = 0;
        for(int i = 0; i < stones.length(); i++) 
        {
            char ch = stones.charAt(i);
            if(map.get(ch) != null) {
                count++;
            }
        }
        return count;
    }
}