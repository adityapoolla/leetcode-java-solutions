package problems301To400.problem347;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] result = new int[k];
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            if(frequencyMap.get(nums[i]) != null) {
                int count = frequencyMap.get(nums[i]);
                frequencyMap.put(nums[i], ++count);
            }
            else {
                frequencyMap.put(nums[i], 1);
            }
        }
        Comparator<Integer> valueComparator = new Comparator<>() {
            public int compare(Integer i, Integer j) {
                int comp = frequencyMap.get(j).compareTo(frequencyMap.get(i));
                if (comp == 0) 
                    return 1; 
                else
                    return comp; 
            }
        };
        TreeMap<Integer, Integer> sortedMap = new TreeMap<>(valueComparator);
        sortedMap.putAll(frequencyMap);
        int i = 0;
        for(Map.Entry<Integer, Integer> e: sortedMap.entrySet()) {
            if(i == k) break;
            result[i] = e.getKey();
            i++;
        }
        return result;
    }
}
