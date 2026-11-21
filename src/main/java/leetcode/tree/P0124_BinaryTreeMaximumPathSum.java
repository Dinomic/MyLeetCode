package leetcode.tree;

import leetcode.common.TreeNode;
import static leetcode.common.Check.*;

/**
 * 124. Binary Tree Maximum Path Sum (Hard) - https://leetcode.com/problems/binary-tree-maximum-path-sum/
 * <p>
 * Idea: TODO
 * Time O(?), Space O(?).
 */
public class P0124_BinaryTreeMaximumPathSum {
    public int maxPathSum(TreeNode root) {
        // TODO
        return 0;
    }

    public static void main(String[] args) {
        P0124_BinaryTreeMaximumPathSum sol = new P0124_BinaryTreeMaximumPathSum();
        check(sol.maxPathSum(TreeNode.of(1, 2, 3)), 6);
        check(sol.maxPathSum(TreeNode.of(-10, 9, 20, null, null, 15, 7)), 42);
        check(sol.maxPathSum(TreeNode.of(-3)), -3);
    }
}
