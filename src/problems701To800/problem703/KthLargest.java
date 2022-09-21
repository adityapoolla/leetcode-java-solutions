package problems701To800.problem703;

import java.util.PriorityQueue;

class KthLargest {
    final PriorityQueue<Integer> q;
    final int k;

    public KthLargest(int k, int[] a) {
        this.k = k;
        q = new PriorityQueue<>(k);
        for (int n : a)
            add(n);
    }

    public int add(int n) {
        if (q.size() < k)
            q.offer(n);
        else if (q.peek() < n) {
            q.poll();
            q.offer(n);
        }
        return q.peek();
    }

    public static void main(String[] args) {
        PriorityQueue<Integer> q = new PriorityQueue<>(5);
        System.out.println(q.size());
        q.add(10);
        q.offer(9);
        q.offer(5);
        q.offer(2);
        q.offer(8);
        q.offer(12);
        System.out.println(q.size());
        System.out.println(q.peek());
    }
}