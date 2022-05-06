package problems1To100.problem2;
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

public class Solution {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		int sum = l1.val + l2.val;
		ListNode head = new ListNode(sum % 10);
		ListNode currentNode = head;
		int carry = sum > 9 ? 1 : 0;
		while(l1.next != null || l2.next != null || carry == 1) {
			int val1 = 0, val2 = 0;
			if(l1.next != null) {
				l1 = l1.next;
				val1 = l1.val;
			}
			if(l2.next != null) {
				l2 = l2.next;
				val2 = l2.val;
			}
			sum = val1 + val2 + carry;
			carry = sum > 9 ? 1 : 0;
			ListNode newNode = new ListNode(sum % 10);
			currentNode.next = newNode;
			currentNode = currentNode.next;
		}
		return head;
	}
}