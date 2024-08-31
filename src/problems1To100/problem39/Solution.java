package problems1To100.problem39;

import java.util.ArrayList;
import java.util.List;

class Solution {

    int[] candidates;
    int target;
    List<List<Integer>> result;

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        this.candidates = candidates;
        this.target = target;
        this.result = new ArrayList<>();
        dfs(0, new ArrayList<>(), 0);
        return result;
    }

    private void dfs(int i, List<Integer> cur, int total) {
        if(total == target) {
            result.add(new ArrayList<Integer>(cur));
            return;
        }
        if(i >= candidates.length || total > target) {
            return;
        }
        cur.add(candidates[i]);
        dfs(i, cur, total + candidates[i]);
        cur.remove(cur.size() - 1);
        dfs(i + 1, cur, total);
    }
}