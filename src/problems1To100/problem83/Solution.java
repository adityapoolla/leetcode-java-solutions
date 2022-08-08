package problems1To100.problem83;

import utils.ListNode;

class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode node = head;
        while(node != null) {
            if(node.next != null && node.next.val == node.val) {
                node.next = node.next.next;
            } else {
                node = node.next;
            }
        }
        return head;
    }
}