package problems1001To1100.problem1046;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

class Solution {
    public int lastStoneWeight(int[] stones) {
        Queue<Integer> queue = new PriorityQueue<>(Comparator.reverseOrder());
        for(int i: stones) queue.add(i);
        while(queue.size() > 1) {
            Integer first = queue.poll();
            Integer second = queue.poll();
            if(first > second) queue.add(first - second);
        }
        if(queue.isEmpty()) return 0;
        else return queue.poll();
    }
}