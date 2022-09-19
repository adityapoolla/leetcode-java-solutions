package problems301To400.problem374;

class GuessGame {
    public int guess(int n) {
        return 0;
    }
}

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int i = 1, j = n;
        while(i < j) {
            int mid = i + (j - i) / 2;
            if(guess(mid) == 0) {
                return mid;
            } else if(guess(mid) == 1) {
                i = mid + 1;
            } else {
                j = mid;
            }
        }
        return i;
    }
}
// mid = (l + r )/2 can cause overflow if l = 1 and r = max int