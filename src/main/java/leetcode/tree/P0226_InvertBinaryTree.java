package leetcode.tree;

import java.util.*;
import leetcode.common.TreeNode;
import static leetcode.common.Check.*;

/**
 * 226. Invert Binary Tree (Easy) - https://leetcode.com/problems/invert-binary-tree/
 * <p>
 * Idea: TODO
 * Time O(?), Space O(?).
 */
public class P0226_InvertBinaryTree {
    public TreeNode invertTree(TreeNode root) {
        // TODO
        return null;
    }

    public static void main(String[] args) {
        P0226_InvertBinaryTree sol = new P0226_InvertBinaryTree();
        check(TreeNode.toList(sol.invertTree(TreeNode.of(4, 2, 7, 1, 3, 6, 9))), List.of(4, 7, 2, 9, 6, 3, 1));
        check(TreeNode.toList(sol.invertTree(TreeNode.of(2, 1, 3))), List.of(2, 3, 1));
        check(TreeNode.toList(sol.invertTree(TreeNode.of())), List.of());
    }
}
