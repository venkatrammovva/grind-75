package sol_012_linked_list_cycle;

import common.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListCycleTest {

    LinkedListCycle linkedListCycle = new LinkedListCycle();

    @Test
    public void test1() {
        ListNode root = new ListNode(1);
        root.next = new ListNode(3);
        root.next.next = root;

        assertTrue(linkedListCycle.hasCycle(root));

    }

}