package leetcode.tree;

import leetcode.common.TreeNode;
import static leetcode.common.Check.*;

/**
 * 572. Subtree of Another Tree (Easy) - https://leetcode.com/problems/subtree-of-another-tree/
 * <p>
 * Idea: TODO
 * Time O(?), Space O(?).
 */
public class P0572_SubtreeOfAnotherTree {
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        // TODO
        return false;
    }

    public static void main(String[] args) {
        P0572_SubtreeOfAnotherTree sol = new P0572_SubtreeOfAnotherTree();
        check(sol.isSubtree(TreeNode.of(3, 4, 5, 1, 2), TreeNode.of(4, 1, 2)), true);
        check(sol.isSubtree(TreeNode.of(3, 4, 5, 1, 2, null, null, null, null, 0), TreeNode.of(4, 1, 2)), false);
    }
}
