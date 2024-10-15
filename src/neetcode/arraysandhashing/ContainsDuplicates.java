package neetcode.arraysandhashing;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ContainsDuplicates {
	
	public static void main(String...args) {
		ContainsDuplicates cd = new ContainsDuplicates();
		boolean ans = cd.hasDuplicates(new int[] {1,2,3,4,5});
		System.out.println(ans);
		
		boolean ans2 = cd.hasDuplicates2(new int[] {1, 2, 3, 2, 4});
		System.out.println(ans2);
	}

	// using hashmap
	public boolean hasDuplicates(int[] nums) {
		Map<Integer, Boolean> map = new HashMap<>();
		for(int n : nums) {
			if(map.getOrDefault(n, false)) return true;
			map.put(n, true);
		}
		return false;
	}
	
	//using hashset
	public boolean hasDuplicates2(int[] nums) {
		Set<Integer> set = new HashSet<>();
		for(int n : nums) 
			if(!set.add(n)) return true;
		return false;
	}
}
