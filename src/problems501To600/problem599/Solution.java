package problems501To600.problem599;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        if(list1.length < list2.length)
            return findRestaurant(list2, list1);
        Map<String, Integer> map = new HashMap<>();
        for(int i = 0; i < list2.length; i++) {
            map.put(list2[i], i);
        }
        List<String> result = new ArrayList<>();
        int leastIndexSum = Integer.MAX_VALUE;
        for(int i = 0; i < list1.length; i++) {
            if(i > leastIndexSum) continue;
            if(map.get(list1[i]) != null) {
                int j = map.get(list1[i]);
                if(i + j > leastIndexSum) continue;
                if(list1[i].equals(list2[j])) {
                    if(leastIndexSum > i + j) {
                        result = new ArrayList<>();
                        leastIndexSum = i + j;
                        result.add(list1[i]);
                    } else if(leastIndexSum == i + j) {
                        result.add(list1[i]);
                    }  
                }
            }
        }
        return result.toArray(new String[0]);
    }
}