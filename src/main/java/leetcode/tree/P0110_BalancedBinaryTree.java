package leetcode.tree;

import leetcode.common.TreeNode;
import static leetcode.common.Check.*;

/**
 * 110. Balanced Binary Tree (Easy) - https://leetcode.com/problems/balanced-binary-tree/
 * <p>
 * Idea: TODO
 * Time O(?), Space O(?).
 */
public class P0110_BalancedBinaryTree {
    public boolean isBalanced(TreeNode root) {
        // TODO
        return false;
    }

    public static void main(String[] args) {
        P0110_BalancedBinaryTree sol = new P0110_BalancedBinaryTree();
        check(sol.isBalanced(TreeNode.of(3, 9, 20, null, null, 15, 7)), true);
        check(sol.isBalanced(TreeNode.of(1, 2, 2, 3, 3, null, null, 4, 4)), false);
        check(sol.isBalanced(TreeNode.of()), true);
    }
}
