package leetcode.tree;

import java.util.*;
import leetcode.common.TreeNode;
import static leetcode.common.Check.*;

/**
 * 102. Binary Tree Level Order Traversal (Medium) - https://leetcode.com/problems/binary-tree-level-order-traversal/
 * <p>
 * Idea: TODO
 * Time O(?), Space O(?).
 */
public class P0102_BinaryTreeLevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        // TODO
        return null;
    }

    public static void main(String[] args) {
        P0102_BinaryTreeLevelOrderTraversal sol = new P0102_BinaryTreeLevelOrderTraversal();
        check(sol.levelOrder(TreeNode.of(3, 9, 20, null, null, 15, 7)), List.of(List.of(3), List.of(9, 20), List.of(15, 7)));
        check(sol.levelOrder(TreeNode.of(1)), List.of(List.of(1)));
        check(sol.levelOrder(TreeNode.of()), List.of());
    }
}
