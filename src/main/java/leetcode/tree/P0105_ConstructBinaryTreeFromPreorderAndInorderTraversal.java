package leetcode.tree;

import java.util.*;
import leetcode.common.TreeNode;
import static leetcode.common.Check.*;

/**
 * 105. Construct Binary Tree from Preorder and Inorder Traversal (Medium) - https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/
 * <p>
 * Idea: TODO
 * Time O(?), Space O(?).
 */
public class P0105_ConstructBinaryTreeFromPreorderAndInorderTraversal {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        // TODO
        return null;
    }

    public static void main(String[] args) {
        P0105_ConstructBinaryTreeFromPreorderAndInorderTraversal sol = new P0105_ConstructBinaryTreeFromPreorderAndInorderTraversal();
        check(TreeNode.toList(sol.buildTree(new int[]{3, 9, 20, 15, 7}, new int[]{9, 3, 15, 20, 7})),
                Arrays.asList(3, 9, 20, null, null, 15, 7));
        check(TreeNode.toList(sol.buildTree(new int[]{-1}, new int[]{-1})), List.of(-1));
    }
}
