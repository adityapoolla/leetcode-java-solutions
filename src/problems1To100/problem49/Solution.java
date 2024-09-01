package problems1To100.problem49;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for(String str: strs) {
            String sortStr = sort(str);
            if(map.get(sortStr) != null) {
                map.get(sortStr).add(str);
            } else {
                List<String> l = new ArrayList<>();
                l.add(str);
                map.put(sortStr, l);
            }
        }
        
        return new ArrayList<List<String>>(map.values());
    }

    private String sort(String str) {
        String[] strArr = str.split("");
        Arrays.sort(strArr);
        return String.join("", strArr);
    }
}
