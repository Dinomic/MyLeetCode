package leetcode.tree;

import java.util.*;
import leetcode.common.TreeNode;
import static leetcode.common.Check.*;

/**
 * 199. Binary Tree Right Side View (Medium) - https://leetcode.com/problems/binary-tree-right-side-view/
 * <p>
 * Idea: TODO
 * Time O(?), Space O(?).
 */
public class P0199_BinaryTreeRightSideView {
    public List<Integer> rightSideView(TreeNode root) {
        // TODO
        return null;
    }

    public static void main(String[] args) {
        P0199_BinaryTreeRightSideView sol = new P0199_BinaryTreeRightSideView();
        check(sol.rightSideView(TreeNode.of(1, 2, 3, null, 5, null, 4)), List.of(1, 3, 4));
        check(sol.rightSideView(TreeNode.of(1, null, 3)), List.of(1, 3));
        check(sol.rightSideView(TreeNode.of(1, 2, 3, 4)), List.of(1, 3, 4));
        check(sol.rightSideView(TreeNode.of()), List.of());
    }
}
