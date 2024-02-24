package sol_003_merge_sorted_lists;

import common.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MergeSortedListsTest {

    MergeSortedLists msl = new MergeSortedLists();

    @Test
    public void test1() {
        ListNode l1 = ListNode.convert(List.of(1,2,4));
        ListNode l2 = ListNode.convert(List.of(1,3,4));
        ListNode expected = ListNode.convert(List.of(1,1,2,3,4,4));
        ListNode actual = msl.mergeTwoLists(l1, l2);
        Assertions.assertTrue(ListNode.equals(expected, actual));
    }

    @Test
    public void test2() {
        ListNode l1 = ListNode.convert(List.of());
        ListNode l2 = ListNode.convert(List.of());
        ListNode expected = ListNode.convert(List.of());
        ListNode actual = msl.mergeTwoLists(l1, l2);
        Assertions.assertTrue(ListNode.equals(expected, actual));
    }

    @Test
    public void test3() {
        ListNode l1 = ListNode.convert(List.of());
        ListNode l2 = ListNode.convert(List.of(0));
        ListNode expected = ListNode.convert(List.of(0));
        ListNode actual = msl.mergeTwoLists(l1, l2);
        Assertions.assertTrue(ListNode.equals(expected, actual));
    }


}