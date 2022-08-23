package problems1201To1300.problem1290;

import utils.ListNode;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int getDecimalValue(ListNode head) {
        ListNode start = head;
        int count = 0;
        while(head != null) {
            count++;
            head = head.next;
        }
        int result = 0;
        while(start != null) {
            count--;
            result = result + (start.val * (int)Math.pow(2, count));
            start = start.next;
        }
        return result;
    }
}