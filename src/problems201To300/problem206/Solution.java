package problems201To300.problem206;

class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }

public class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null)
            return null;
        ListNode current = head.next;
        head.next = null;
        ListNode previous = head;
        while(current != null) {
            ListNode temp = current.next;
            current.next = previous;
            previous = current;
            current = temp;
        }
        return previous;
    }
}