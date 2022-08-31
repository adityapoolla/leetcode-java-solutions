package problems1To100.problem22;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class Solution {
    public static List<String> result = new ArrayList<>();
    public static List<String> generateParenthesis(int n) {
        if(n == 0)
            return result;
        String bracks = "(";
        return result;
    }
    
    public static boolean isValid(String str) {
        Stack<Boolean> tracking = new Stack<>();
        for(int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);
            boolean curr = ch == '(' ? true : false;
            if(curr) {
                tracking.push(true);
            } else {
                if(tracking.isEmpty()) {
                    return false;
                }
                tracking.pop();
            }
        }
        if(tracking.isEmpty())
            return true;
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isValid("(()())"));
    }
}