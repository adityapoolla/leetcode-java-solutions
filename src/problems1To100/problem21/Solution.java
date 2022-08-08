package problems1To100.problem21;

import utils.ListNode;

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode start = new ListNode(0);
        ListNode node = start;
        while(list1 != null && list2 != null) {
            if(list1.val < list2.val) {
                node.next = list1;
                list1 = list1.next;
            } else {
                node.next = list2;
                list2 = list2.next;
            }
            node = node.next;
        }
        while(list1 != null) {
            node.next = list1;
            list1 = list1.next;
            node = node.next;
        }
        while(list2 != null) {
            node.next = list2;
            list2 = list2.next;
            node = node.next;
        }
        return start.next;
    }
}