package problems2001To2100.problem2011;

class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int value = 0;
        for(String operation: operations) {
            if(operation.charAt(1) == '+') {
                value++;
            } else {
                value--;
            }
        }
        return value;
    }
}