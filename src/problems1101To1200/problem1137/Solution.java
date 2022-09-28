package problems1101To1200.problem1137;

class Solution {
    
    public int tribonacci(int n) {
        if(n == 0)
            return 0;
        if(n == 1 || n == 2)
            return 1;
        int[] arr = new int[n + 1];
        arr[0] = 0;
        arr[1] = 1;
        arr[2] = 1;
        int i = 3;
        while(i <= n) {
            arr[i] = arr[i - 1] + arr[i - 2] + arr[i - 3];
            i++;
        }
        return arr[n];
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int result = solution.tribonacci(37);
        System.out.println(result);
        System.out.println(Integer.MAX_VALUE);
    }
}