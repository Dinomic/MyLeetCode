package leetcode.tree;

import leetcode.common.TreeNode;
import static leetcode.common.Check.*;

/**
 * 100. Same Tree (Easy) - https://leetcode.com/problems/same-tree/
 * <p>
 * Idea: TODO
 * Time O(?), Space O(?).
 */
public class P0100_SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        // TODO
        return false;
    }

    public static void main(String[] args) {
        P0100_SameTree sol = new P0100_SameTree();
        check(sol.isSameTree(TreeNode.of(1, 2, 3), TreeNode.of(1, 2, 3)), true);
        check(sol.isSameTree(TreeNode.of(1, 2), TreeNode.of(1, null, 2)), false);
        check(sol.isSameTree(TreeNode.of(1, 2, 1), TreeNode.of(1, 1, 2)), false);
    }
}
