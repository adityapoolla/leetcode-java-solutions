package problems801To900.problem875;
class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int m = max(piles);
        int l = 1;
        while(l < m) {
            int mid = l + (m - l) / 2;
            int time = calculateTime(piles, mid);
            if(time <= h)  {
                m = mid;
            }
            else l = mid + 1;
        }
        return l;
    }

    private int calculateTime(int[] piles, int speed) {
        int time = 0;
        for(int i = 0; i < piles.length; i++) {
            time += piles[i] / speed;
            if(piles[i] % speed != 0) time += 1;
        }
        return time;
    }

    private int max(int[] piles) {
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < piles.length; i++) {
            if(piles[i] > max) max = piles[i];
        }
        return max;
    }
}