package test;

import java.util.Arrays;

public class Solution {

	public static int maxAmount(int[] chocos, int[] pens) {
		
		int maxAmount = -1;
		Arrays.sort(chocos);
		Arrays.sort(pens);
		
		for(int i = 0; i < chocos.length - 1; i++) {
			if(chocos[i] >= 10)
				break;
			if(i > 0 && chocos[i] == chocos[i-1])
				continue;
			int j = 0;
			while(j < pens.length && chocos[i] + pens[j] <= 10) {
				if(chocos[i] + pens[j] > maxAmount) {
					maxAmount = chocos[i] + pens[j];
				}
				j++;
			}
		}
		return maxAmount;
	}
	
	public static void main(String[] args) {
		int[] chocos = {1, 3, 4, 8, 10, 12};
		int[] pens = {10};
		System.out.println(maxAmount(chocos, pens));
	}
}
