package sol_012_linked_list_cycle;

import common.ListNode;

// https://leetcode.com/problems/linked-list-cycle
public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        if(head == null || head.next == null) return false;

        ListNode fast = head;
        ListNode slow = head;

        while(fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast) return true;
        }
        return false;
    }
}
