package problems901To1000.problem933;

import java.util.*;

class RecentCounter {
    private Queue<Integer> queue;
    public RecentCounter() {
        queue = new PriorityQueue();
    }
    
    public int ping(int t) {
        queue.add(t);
        int window = t - 3000;
        while(queue.peek() < window) {
            queue.poll();
        }
        return queue.size();
    }
}
