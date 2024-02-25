package sol_018_reverse_linked_list;

import common.ListNode;

// https://leetcode.com/problems/reverse-linked-list/
public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }
        ListNode prev = null;
        ListNode next = null;

        while(head != null) {
            next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }
}
