package leetcode.linkedlist;

import java.util.*;
import leetcode.common.ListNode;
import static leetcode.common.Check.*;

/**
 * 23. Merge k Sorted Lists (Hard) - https://leetcode.com/problems/merge-k-sorted-lists/
 * <p>
 * Idea: TODO
 * Time O(?), Space O(?).
 */
public class P0023_MergeKSortedLists {
    public ListNode mergeKLists(ListNode[] lists) {
        // TODO
        return null;
    }

    public static void main(String[] args) {
        P0023_MergeKSortedLists sol = new P0023_MergeKSortedLists();
        check(ListNode.toList(sol.mergeKLists(new ListNode[]{ListNode.of(1, 4, 5), ListNode.of(1, 3, 4), ListNode.of(2, 6)})),
                List.of(1, 1, 2, 3, 4, 4, 5, 6));
        check(ListNode.toList(sol.mergeKLists(new ListNode[]{})), List.of());
        check(ListNode.toList(sol.mergeKLists(new ListNode[]{null})), List.of());
    }
}
