package leetcode.linkedlist;

import java.util.*;
import leetcode.common.ListNode;
import static leetcode.common.Check.*;

/**
 * 19. Remove Nth Node From End of List (Medium) - https://leetcode.com/problems/remove-nth-node-from-end-of-list/
 * <p>
 * Idea: TODO
 * Time O(?), Space O(?).
 */
public class P0019_RemoveNthNodeFromEndOfList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // TODO
        return null;
    }

    public static void main(String[] args) {
        P0019_RemoveNthNodeFromEndOfList sol = new P0019_RemoveNthNodeFromEndOfList();
        check(ListNode.toList(sol.removeNthFromEnd(ListNode.of(1, 2, 3, 4, 5), 2)), List.of(1, 2, 3, 5));
        check(ListNode.toList(sol.removeNthFromEnd(ListNode.of(1), 1)), List.of());
        check(ListNode.toList(sol.removeNthFromEnd(ListNode.of(1, 2), 1)), List.of(1));
    }
}
