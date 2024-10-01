package problems601To700.problem645;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

class Solution {
	
	// 20ms solution
    public int[] findErrorNums(int[] nums) {
        Set<Integer> set = new TreeSet<>();
        int[] result = new int[2];
        for(int i = 0; i < nums.length; i++) {
            if(!set.add(nums[i]))
                result[0] = nums[i];
        }
        Iterator<Integer> iterator = set.iterator();
        int i = 1;
        while(iterator.hasNext()) {
            if(iterator.next() != i) {
                result[1] = i;
                break;
            }
            i++;
        }
        if(result[1] == 0) 
            result[1] = i;
        return result;
    }
    
    
    //11ms solution
    public int[] findErrorNums2(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int[] result = new int[2];
        for(int i = 0; i < nums.length; i++)
        {
            if(!set.add(nums[i])) {
                result[0] = nums[i];
            }
        }
        for(int i = 1; i <= nums.length; i++) {
            if(!set.contains(i)) {
                result[1] = i;
                break;
            }
        }
        return result;
    }
}