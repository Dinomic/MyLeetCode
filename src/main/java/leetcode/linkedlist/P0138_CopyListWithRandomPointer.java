package leetcode.linkedlist;

import java.util.*;
import static leetcode.common.Check.*;

/**
 * 138. Copy List with Random Pointer (Medium) - https://leetcode.com/problems/copy-list-with-random-pointer/
 * <p>
 * Idea: TODO
 * Time O(?), Space O(?).
 */
public class P0138_CopyListWithRandomPointer {
    static class Node {
        int val;
        Node next;
        Node random;

        Node(int val) {
            this.val = val;
        }
    }

    public Node copyRandomList(Node head) {
        // TODO
        return null;
    }

    /** Builds a list from {value, randomIndex} pairs; randomIndex -1 means random = null. */
    static Node build(int[][] data) {
        Node[] nodes = new Node[data.length];
        for (int i = 0; i < data.length; i++) {
            nodes[i] = new Node(data[i][0]);
        }
        for (int i = 0; i < data.length; i++) {
            if (i + 1 < data.length) {
                nodes[i].next = nodes[i + 1];
            }
            if (data[i][1] >= 0) {
                nodes[i].random = nodes[data[i][1]];
            }
        }
        return data.length == 0 ? null : nodes[0];
    }

    /** Inverse of build: {value, randomIndex} for every node. */
    static int[][] toData(Node head) {
        List<Node> nodes = new ArrayList<>();
        Map<Node, Integer> index = new IdentityHashMap<>();
        for (Node n = head; n != null; n = n.next) {
            index.put(n, nodes.size());
            nodes.add(n);
        }
        int[][] data = new int[nodes.size()][];
        for (int i = 0; i < nodes.size(); i++) {
            Node n = nodes.get(i);
            data[i] = new int[]{n.val, n.random == null ? -1 : index.get(n.random)};
        }
        return data;
    }

    public static void main(String[] args) {
        P0138_CopyListWithRandomPointer sol = new P0138_CopyListWithRandomPointer();
        int[][] data = {{7, -1}, {13, 0}, {11, 4}, {10, 2}, {1, 0}};
        Node original = build(data);
        Node copy = sol.copyRandomList(original);
        check(toData(copy), data);
        check(copy != original, true); // must be a deep copy, not the same nodes
        check(toData(sol.copyRandomList(build(new int[][]{{1, 1}, {2, 1}}))), new int[][]{{1, 1}, {2, 1}});
        check(sol.copyRandomList(null), null);
    }
}
