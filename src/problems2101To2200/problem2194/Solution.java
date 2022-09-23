package problems2101To2200.problem2194;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> cellsInRange(String s) {
        List<String> result = new ArrayList<>();
        char colStart = s.charAt(0);
        int rowStart = Integer.parseInt(s.charAt(1) + "");
        char colEnd = s.charAt(3);
        int rowEnd = Integer.parseInt(s.charAt(4) + "");
        char c = colStart;
        int i = rowStart;
        StringBuilder sb = new StringBuilder();
        while(c <= colEnd && i <= rowEnd) {
            sb.append(c);
            sb.append(i);
            result.add(sb.toString());
            sb.setLength(0);
            if(i < rowEnd)
                i++;
            else {
                c = (char)(c + 1);
                i = rowStart;
            }
        }
        return result;
    }
}