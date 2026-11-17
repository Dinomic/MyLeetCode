package leetcode.common;

import java.util.ArrayList;
import java.util.List;

/**
 * Singly-linked list node shared by all linked-list problems.
 * Same shape as LeetCode's definition, plus helpers for tests.
 */
public class ListNode {
    public int val;
    public ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    /** Builds a list from values, e.g. {@code ListNode.of(2, 4, 3)} is 2 -> 4 -> 3. Returns null for no values. */
    public static ListNode of(int... values) {
        ListNode dummy = new ListNode();
        ListNode tail = dummy;
        for (int v : values) {
            tail.next = new ListNode(v);
            tail = tail.next;
        }
        return dummy.next;
    }

    public static List<Integer> toList(ListNode head) {
        List<Integer> result = new ArrayList<>();
        for (ListNode n = head; n != null; n = n.next) {
            result.add(n.val);
        }
        return result;
    }
}
