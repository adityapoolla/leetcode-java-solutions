package problems800To900.problem876;

import utils.ListNode;

class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode mid = head;
        boolean odd = true;
        while(head != null) {
            if(!odd) {   
                mid = mid.next;
            }
            odd = !odd;
            head = head.next;
        }
        return mid;
    }
}