package leetcode.tree;

import leetcode.common.TreeNode;
import static leetcode.common.Check.*;

/**
 * 98. Validate Binary Search Tree (Medium) - https://leetcode.com/problems/validate-binary-search-tree/
 * <p>
 * Idea: TODO
 * Time O(?), Space O(?).
 */
public class P0098_ValidateBinarySearchTree {
    public boolean isValidBST(TreeNode root) {
        // TODO
        return false;
    }

    public static void main(String[] args) {
        P0098_ValidateBinarySearchTree sol = new P0098_ValidateBinarySearchTree();
        check(sol.isValidBST(TreeNode.of(2, 1, 3)), true);
        check(sol.isValidBST(TreeNode.of(5, 1, 4, null, null, 3, 6)), false);
        check(sol.isValidBST(TreeNode.of(2, 2, 2)), false);
        check(sol.isValidBST(TreeNode.of(5, 4, 6, null, null, 3, 7)), false);
    }
}
