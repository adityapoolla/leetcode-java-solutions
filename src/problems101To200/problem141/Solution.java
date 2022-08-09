package problems101To200.problem141;

import utils.ListNode;

//Floyd's circle finding algorithm for linked list
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode temp = new ListNode();
        while(head != null) {
            if(head.next == null)
                return false;
            if(head.next == temp)
                return true;
            ListNode next = head.next;
            head.next = temp;
            head = next;
        }
        return false;
    }
}