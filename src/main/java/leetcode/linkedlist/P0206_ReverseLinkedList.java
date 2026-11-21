package leetcode.linkedlist;

import java.util.*;
import leetcode.common.ListNode;
import static leetcode.common.Check.*;

/**
 * 206. Reverse Linked List (Easy) - https://leetcode.com/problems/reverse-linked-list/
 * <p>
 * Idea: TODO
 * Time O(?), Space O(?).
 */
public class P0206_ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        // TODO
        return null;
    }

    public static void main(String[] args) {
        P0206_ReverseLinkedList sol = new P0206_ReverseLinkedList();
        check(ListNode.toList(sol.reverseList(ListNode.of(1, 2, 3, 4, 5))), List.of(5, 4, 3, 2, 1));
        check(ListNode.toList(sol.reverseList(ListNode.of(1, 2))), List.of(2, 1));
        check(ListNode.toList(sol.reverseList(ListNode.of())), List.of());
    }
}
