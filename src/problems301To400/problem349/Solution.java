package problems301To400.problem349;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> result = new ArrayList<>();
        Map<Integer, Boolean> map = new HashMap<>();
        for(int num: nums1) {
            map.put(num, false);
        }
        
        for(int num: nums2) {
            Boolean bool = map.get(num);
            if(bool != null && bool == false) {
                result.add(num);
                map.put(num, true);
            }
        }
        
        int[] arr = new int[result.size()];
        int i = 0;
        while(i < result.size()) {
            arr[i] = result.get(i);
            i++;
        }
        return arr;
    }
}