package problems1801To1900.problem1897;

import java.util.*;
import java.util.stream.Collectors;
import java.util.function.Function;

class Solution {
	public boolean makeEqual(String[] words) {
		if (words.length == 1)
			return true;
		final int len = words.length;
		return Arrays.stream(words).flatMap(i -> i.chars().mapToObj(j -> (char) j))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
				.allMatch(i -> i.getValue() % len == 0);
	}
}