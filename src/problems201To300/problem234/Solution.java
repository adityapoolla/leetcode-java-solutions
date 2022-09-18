package problems201To300.problem234;

import utils.ListNode;

class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode tail = reverse(head);
        while(head != null && tail != null) {
            if(head.val != tail.val)
                return false;
            head = head.next;
            tail = tail.next;
        }
        return true;
    }
    
    private ListNode reverse(ListNode head) {
        ListNode node = null;
        ListNode temp = null;
        while(head != null) {
            node = new ListNode(head.val);
            node.next = temp;
            head = head.next;
            temp = node;
        }
        return node;
    }
}