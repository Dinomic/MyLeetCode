package leetcode.tree;

import leetcode.common.TreeNode;
import static leetcode.common.Check.*;

/**
 * 235. Lowest Common Ancestor of a Binary Search Tree (Medium) - https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/
 * <p>
 * Idea: TODO
 * Time O(?), Space O(?).
 */
public class P0235_LowestCommonAncestorOfABinarySearchTree {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        // TODO
        return null;
    }

    public static void main(String[] args) {
        P0235_LowestCommonAncestorOfABinarySearchTree sol = new P0235_LowestCommonAncestorOfABinarySearchTree();
        TreeNode root = TreeNode.of(6, 2, 8, 0, 4, 7, 9, null, null, 3, 5);
        check(TreeNode.valOrNull(sol.lowestCommonAncestor(root, TreeNode.find(root, 2), TreeNode.find(root, 8))), 6);
        check(TreeNode.valOrNull(sol.lowestCommonAncestor(root, TreeNode.find(root, 2), TreeNode.find(root, 4))), 2);
        TreeNode small = TreeNode.of(2, 1);
        check(TreeNode.valOrNull(sol.lowestCommonAncestor(small, TreeNode.find(small, 2), TreeNode.find(small, 1))), 2);
    }
}
