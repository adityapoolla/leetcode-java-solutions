package problems1To100.problem3;

import java.util.HashMap;
import java.util.Map;

class Solution2 {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 0)
            return 0;
        char[] c = s.toCharArray();
        return util(c, 0, c.length - 1);
    }
    
    private int util(char[] c, int l, int r) {
        while(l < r) {
            int mid = (l + r) / 2;
            int left = util(c, l, mid);
            int right = util(c, mid + 1, r);
            Map<Character, Boolean> map = new HashMap<>();
            int middle = 1;
            map.put(c[mid], true);
            int ls = mid - 1, rs = mid + 1;
            while(ls >= l && rs <= r && map.get(c[ls]) == null && map.get(c[rs]) == null && c[ls] != c[rs]) {
                middle += 2;
                map.put(c[ls], true);
                map.put(c[rs], true);
                ls--;
                rs++;
            }
            while(ls >= l && map.get(c[ls]) == null) {
                middle += 1;
                map.put(c[ls], true);
                ls--;
            }
            while(rs <= r && map.get(c[rs]) == null) {
                middle += 1;
                map.put(c[rs], true);
                rs++;
            }
            return Math.max(left, Math.max(right, middle));
            
        }
        return 1;
    }

    public static void main(String[] args) {
        new Solution2().lengthOfLongestSubstring("bdb");
    }
}