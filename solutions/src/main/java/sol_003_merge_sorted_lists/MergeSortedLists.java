package sol_003_merge_sorted_lists;

import common.ListNode;

// https://leetcode.com/problems/merge-two-sorted-lists
public class MergeSortedLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = null;
        ListNode result = null;

        while(list1 != null && list2 != null) {
            ListNode curr = null;
            if(list1.val < list2.val) {
                curr = list1;
                list1 = list1.next;
            } else {
                curr = list2;
                list2 = list2.next;
            }
            if(result == null) {
                result = curr;
                head = result;
            } else {
                result.next = curr;
                result = result.next;
            }

        }
        if(list1 == null && list2 != null) {
            if(result == null) {
                return list2;
            } else {
                result.next = list2;
            }
        }
        else {
            if(result == null) {
                return list1;
            } else {
                result.next = list1;
            }
        }
        return head;
    }
}
