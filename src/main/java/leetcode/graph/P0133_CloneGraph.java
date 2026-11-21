package leetcode.graph;

import java.util.*;
import static leetcode.common.Check.*;

/**
 * 133. Clone Graph (Medium) - https://leetcode.com/problems/clone-graph/
 * <p>
 * Idea: TODO
 * Time O(?), Space O(?).
 */
public class P0133_CloneGraph {
    static class Node {
        int val;
        List<Node> neighbors = new ArrayList<>();

        Node(int val) {
            this.val = val;
        }
    }

    public Node cloneGraph(Node node) {
        // TODO
        return null;
    }

    /** Builds a graph from LeetCode's adjacency list: adj[i] holds the neighbors of node i + 1. */
    static Node build(int[][] adj) {
        if (adj.length == 0) {
            return null;
        }
        Node[] nodes = new Node[adj.length];
        for (int i = 0; i < adj.length; i++) {
            nodes[i] = new Node(i + 1);
        }
        for (int i = 0; i < adj.length; i++) {
            for (int v : adj[i]) {
                nodes[i].neighbors.add(nodes[v - 1]);
            }
        }
        return nodes[0];
    }

    /** Inverse of build (nodes are looked up by value, so a correct clone gives the same adjacency list). */
    static int[][] toAdj(Node start) {
        if (start == null) {
            return new int[0][];
        }
        Map<Integer, Node> byVal = new TreeMap<>();
        Deque<Node> queue = new ArrayDeque<>();
        byVal.put(start.val, start);
        queue.add(start);
        while (!queue.isEmpty()) {
            Node cur = queue.poll();
            for (Node nb : cur.neighbors) {
                if (byVal.putIfAbsent(nb.val, nb) == null) {
                    queue.add(nb);
                }
            }
        }
        int[][] adj = new int[byVal.size()][];
        for (Node n : byVal.values()) {
            adj[n.val - 1] = n.neighbors.stream().mapToInt(x -> x.val).toArray();
        }
        return adj;
    }

    public static void main(String[] args) {
        P0133_CloneGraph sol = new P0133_CloneGraph();
        int[][] adj = {{2, 4}, {1, 3}, {2, 4}, {1, 3}};
        Node original = build(adj);
        Node copy = sol.cloneGraph(original);
        check(toAdj(copy), adj);
        check(copy != original, true); // must be a deep copy, not the same nodes
        check(toAdj(sol.cloneGraph(build(new int[][]{{}}))), new int[][]{{}});
        check(sol.cloneGraph(null), null);
    }
}
