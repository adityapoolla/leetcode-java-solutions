package problems101To200.problem160;

import utils.ListNode;

import java.util.*;

public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode ptr1 = headA;
        ListNode ptr2 = headB;
        
        int alen = 0;
        while(ptr1 != null) {
            ptr1= ptr1.next;
            alen++;
        }
        int blen = 0;
        while(ptr2 != null) {
            ptr2 = ptr2.next;
            blen++;
        }
        ptr1 = headA;
        ptr2 = headB;
        
        if(alen > blen) {
            int diff = alen - blen;
            while(diff > 0) {
                ptr1 = ptr1.next;
                diff--;
            }
        } else {
            int diff = blen - alen;
            while(diff > 0) {
                ptr2 = ptr2.next;
                diff--;
            }
        }
        
        while(ptr1 != ptr2) {
            if(ptr1 == null || ptr2 == null)
                return null;
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
        }
            
        return ptr1;
    }
        
}