package problems1To100.problem24;

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
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null)
            return head;
        ListNode one = head;
        ListNode two = one.next;
        ListNode three = two.next;
        two.next = one;
        head = two;
        one.next = null;
        while(three != null) {
            ListNode newOne = three;
            ListNode newTwo = newOne.next;
            if(newTwo != null) {
                three = newTwo.next;
                newTwo.next = newOne;
                newOne.next = null;
                one.next = newTwo;
                one = newOne;
            }
            else {
                three = null;
                newOne.next = null;
                one.next = newOne;
            }
        }
        return head;
    }
    
}