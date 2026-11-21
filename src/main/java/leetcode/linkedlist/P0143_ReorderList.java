package leetcode.linkedlist;

import java.util.*;
import leetcode.common.ListNode;
import static leetcode.common.Check.*;

/**
 * 143. Reorder List (Medium) - https://leetcode.com/problems/reorder-list/
 * <p>
 * Idea: TODO
 * Time O(?), Space O(?).
 */
public class P0143_ReorderList {
    public void reorderList(ListNode head) {
        // TODO
    }

    public static void main(String[] args) {
        P0143_ReorderList sol = new P0143_ReorderList();
        ListNode a = ListNode.of(1, 2, 3, 4);
        sol.reorderList(a);
        check(ListNode.toList(a), List.of(1, 4, 2, 3));
        ListNode b = ListNode.of(1, 2, 3, 4, 5);
        sol.reorderList(b);
        check(ListNode.toList(b), List.of(1, 5, 2, 4, 3));
    }
}
