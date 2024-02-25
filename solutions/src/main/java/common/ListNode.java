package common;

import java.util.List;

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public static ListNode convert(List<Integer> input) {
        if (input.size() == 0) return null;
        ListNode head = new ListNode(input.get(0));
        ListNode curr = head;
        for (int i = 1; i < input.size(); i++) {
            ListNode newNode = new ListNode(input.get(i));
            curr.next = newNode;
            curr = curr.next;
        }
        return head;
    }

    public static boolean equals(ListNode l1, ListNode l2) {
        if(l1 == null && l2 == null) return true;
        if(l1 == null || l2 == null) return false;
        while(l1 != null && l2 != null) {
            if(l1.val != l2.val) return false;
            l1 = l1.next;
            l2 = l2.next;
        }
        return (l1 == null && l2 == null);
    }
}
