package leetcode.tree;

import leetcode.common.TreeNode;
import static leetcode.common.Check.*;

/**
 * 230. Kth Smallest Element in a BST (Medium) - https://leetcode.com/problems/kth-smallest-element-in-a-bst/
 * <p>
 * Idea: TODO
 * Time O(?), Space O(?).
 */
public class P0230_KthSmallestElementInABST {
    public int kthSmallest(TreeNode root, int k) {
        // TODO
        return 0;
    }

    public static void main(String[] args) {
        P0230_KthSmallestElementInABST sol = new P0230_KthSmallestElementInABST();
        check(sol.kthSmallest(TreeNode.of(3, 1, 4, null, 2), 1), 1);
        check(sol.kthSmallest(TreeNode.of(5, 3, 6, 2, 4, null, null, 1), 3), 3);
    }
}
