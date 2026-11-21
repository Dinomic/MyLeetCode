package leetcode.linkedlist;

import leetcode.common.ListNode;
import static leetcode.common.Check.*;

/**
 * 141. Linked List Cycle (Easy) - https://leetcode.com/problems/linked-list-cycle/
 * <p>
 * Idea: TODO
 * Time O(?), Space O(?).
 */
public class P0141_LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        // TODO
        return false;
    }

    public static void main(String[] args) {
        P0141_LinkedListCycle sol = new P0141_LinkedListCycle();
        check(sol.hasCycle(ListNode.withCycle(1, 3, 2, 0, -4)), true);
        check(sol.hasCycle(ListNode.withCycle(0, 1, 2)), true);
        check(sol.hasCycle(ListNode.withCycle(-1, 1)), false);
    }
}
