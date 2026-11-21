package leetcode.tree;

import leetcode.common.TreeNode;
import static leetcode.common.Check.*;

/**
 * 1448. Count Good Nodes in Binary Tree (Medium) - https://leetcode.com/problems/count-good-nodes-in-binary-tree/
 * <p>
 * Idea: TODO
 * Time O(?), Space O(?).
 */
public class P1448_CountGoodNodesInBinaryTree {
    public int goodNodes(TreeNode root) {
        // TODO
        return 0;
    }

    public static void main(String[] args) {
        P1448_CountGoodNodesInBinaryTree sol = new P1448_CountGoodNodesInBinaryTree();
        check(sol.goodNodes(TreeNode.of(3, 1, 4, 3, null, 1, 5)), 4);
        check(sol.goodNodes(TreeNode.of(3, 3, null, 4, 2)), 3);
        check(sol.goodNodes(TreeNode.of(1)), 1);
    }
}
