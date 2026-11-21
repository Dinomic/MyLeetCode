package leetcode.tree;

import leetcode.common.TreeNode;
import static leetcode.common.Check.*;

/**
 * 543. Diameter of Binary Tree (Easy) - https://leetcode.com/problems/diameter-of-binary-tree/
 * <p>
 * Idea: TODO
 * Time O(?), Space O(?).
 */
public class P0543_DiameterOfBinaryTree {
    public int diameterOfBinaryTree(TreeNode root) {
        // TODO
        return 0;
    }

    public static void main(String[] args) {
        P0543_DiameterOfBinaryTree sol = new P0543_DiameterOfBinaryTree();
        check(sol.diameterOfBinaryTree(TreeNode.of(1, 2, 3, 4, 5)), 3);
        check(sol.diameterOfBinaryTree(TreeNode.of(1, 2)), 1);
    }
}
