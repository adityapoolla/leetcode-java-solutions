package problems201To300.problem278;
class VersionControl {
    public boolean isBadVersion(int i) {
        return false;
    }
}
public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int start = 1, end = n;
        while (start < end) {
            int mid = start + (end-start) / 2;
            if (!isBadVersion(mid)) start = mid + 1;
            else end = mid;            
        }        
        return start;
    }
    
}