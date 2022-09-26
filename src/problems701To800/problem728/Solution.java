package problems701To800.problem728;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> result = new ArrayList<>();
        for(int i = left; i <= right; i++) {
            if(isSelfDividingNumber(i))
                result.add(i);
        }
        return result;
    }
    
    public boolean isSelfDividingNumber(int num) {
        int orginal = num;
        while(num > 0) {
            int digit = num % 10;
            if(digit == 0)
                return false;
            if(orginal % digit != 0)
                return false;
            num /= 10;
        }
        return true;
    }
}