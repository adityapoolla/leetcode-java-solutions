package problems1To100.problem84;

import java.util.Stack;

class Solution {
    public int largestRectangleArea(int[] heights) {
        int maxArea = 0; 
        Stack<Histogram> stack = new Stack<>();
        for(int i = 0; i < heights.length; i++) {
            int start = i;
            while(!stack.isEmpty() && heights[i] < stack.peek().height) {
                Histogram hist = stack.pop();
                maxArea = Math.max(maxArea, hist.height * (i - hist.index));
                start = hist.index;
            }
            stack.push(new Histogram(start, heights[i]));
        }

        while(!stack.isEmpty()) {
            Histogram hist = stack.pop();
            maxArea = Math.max(maxArea, hist.height * (heights.length - hist.index));
        }
        return maxArea;
    }

    class Histogram {
        int index;
        int height;
        public Histogram(int index, int height) {
            this.index = index;
            this.height = height;
        }
    }
}