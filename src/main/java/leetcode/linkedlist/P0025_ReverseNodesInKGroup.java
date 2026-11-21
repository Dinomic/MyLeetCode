package leetcode.linkedlist;

import java.util.*;
import leetcode.common.ListNode;
import static leetcode.common.Check.*;

/**
 * 25. Reverse Nodes in k-Group (Hard) - https://leetcode.com/problems/reverse-nodes-in-k-group/
 * <p>
 * Idea: TODO
 * Time O(?), Space O(?).
 */
public class P0025_ReverseNodesInKGroup {
    public ListNode reverseKGroup(ListNode head, int k) {
        // TODO
        return null;
    }

    public static void main(String[] args) {
        P0025_ReverseNodesInKGroup sol = new P0025_ReverseNodesInKGroup();
        check(ListNode.toList(sol.reverseKGroup(ListNode.of(1, 2, 3, 4, 5), 2)), List.of(2, 1, 4, 3, 5));
        check(ListNode.toList(sol.reverseKGroup(ListNode.of(1, 2, 3, 4, 5), 3)), List.of(3, 2, 1, 4, 5));
    }
}
