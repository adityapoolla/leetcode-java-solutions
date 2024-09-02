package problems101To200.problem128;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int longestConsecutive(int[] nums) {
        Map<Integer, Boolean> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            map.put(nums[i], false);
        }
        int longest = 0;
        for(int i = 0; i < nums.length; i++) {
            if(map.get(nums[i]) != null && map.get(nums[i])) {
                continue;
            }
            if(map.get(nums[i] - 1) != null) {
                continue;
            }
            int seqlen = 1;
            int start = nums[i];
            while(map.get(++start) != null) {
                seqlen++;
                map.put(start, true);
            }
            if(seqlen > longest) {
                longest = seqlen;
            }
        }
        return longest;
    }
}