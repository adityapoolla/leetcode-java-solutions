package problems101To200.problem121;

public class Solution {
    public int maxProfit(int[] prices) {
    	int minPointer = 0;
    	int maxProfit = 0;
    	for(int i = 0; i < prices.length; i++) {
    		if(prices[i] < prices[minPointer]) {
    			minPointer = i;
    		}
    		if(prices[i] - prices[minPointer] > maxProfit) {
    			maxProfit = prices[i] - prices[minPointer];
    		}
    	}
		return maxProfit;
    }
    
    public static void main(String[] args) {
    	int[] input = {1, 7, 6, 9};
		System.out.println(new Solution().maxProfit(input));
	}
}