package problems1To100.problem22;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class Solution2 {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        backtrack(result, new Stack<>(), n, 0, 0);
        return result;
    }

    private void backtrack(List<String> result, Stack<String> stack, int n, int openN, int closedN) {
        if(openN == closedN && openN == n) {
            result.add(String.join("", stack));
            return;
        }
        if(openN < n) {
            stack.push("(");
            backtrack(result, stack, n, openN + 1, closedN);
            stack.pop();
        }
        if(closedN < openN) {
            stack.push(")");
            backtrack(result, stack, n, openN, closedN + 1);
            stack.pop();
        }
    }
}