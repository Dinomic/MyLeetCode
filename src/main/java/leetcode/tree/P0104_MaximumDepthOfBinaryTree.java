package leetcode.tree;

import leetcode.common.TreeNode;
import static leetcode.common.Check.*;

/**
 * 104. Maximum Depth of Binary Tree (Easy) - https://leetcode.com/problems/maximum-depth-of-binary-tree/
 * <p>
 * Idea: TODO
 * Time O(?), Space O(?).
 */
public class P0104_MaximumDepthOfBinaryTree {
    public int maxDepth(TreeNode root) {
        // TODO
        return 0;
    }

    public static void main(String[] args) {
        P0104_MaximumDepthOfBinaryTree sol = new P0104_MaximumDepthOfBinaryTree();
        check(sol.maxDepth(TreeNode.of(3, 9, 20, null, null, 15, 7)), 3);
        check(sol.maxDepth(TreeNode.of(1, null, 2)), 2);
        check(sol.maxDepth(TreeNode.of()), 0);
    }
}
