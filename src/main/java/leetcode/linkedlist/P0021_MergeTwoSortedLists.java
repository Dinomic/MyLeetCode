package leetcode.linkedlist;

import java.util.*;
import leetcode.common.ListNode;
import static leetcode.common.Check.*;

/**
 * 21. Merge Two Sorted Lists (Easy) - https://leetcode.com/problems/merge-two-sorted-lists/
 * <p>
 * Idea: TODO
 * Time O(?), Space O(?).
 */
public class P0021_MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // TODO
        return null;
    }

    public static void main(String[] args) {
        P0021_MergeTwoSortedLists sol = new P0021_MergeTwoSortedLists();
        check(ListNode.toList(sol.mergeTwoLists(ListNode.of(1, 2, 4), ListNode.of(1, 3, 4))), List.of(1, 1, 2, 3, 4, 4));
        check(ListNode.toList(sol.mergeTwoLists(ListNode.of(), ListNode.of())), List.of());
        check(ListNode.toList(sol.mergeTwoLists(ListNode.of(), ListNode.of(0))), List.of(0));
    }
}
