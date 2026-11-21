package leetcode.tree;

import java.util.*;
import leetcode.common.TreeNode;
import static leetcode.common.Check.*;

/**
 * 297. Serialize and Deserialize Binary Tree (Hard) - https://leetcode.com/problems/serialize-and-deserialize-binary-tree/
 * <p>
 * Idea: TODO
 * Time O(?), Space O(?).
 */
public class P0297_SerializeAndDeserializeBinaryTree {
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        // TODO
        return null;
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        // TODO
        return null;
    }

    public static void main(String[] args) {
        P0297_SerializeAndDeserializeBinaryTree codec = new P0297_SerializeAndDeserializeBinaryTree();
        check(TreeNode.toList(codec.deserialize(codec.serialize(TreeNode.of(1, 2, 3, null, null, 4, 5)))),
                Arrays.asList(1, 2, 3, null, null, 4, 5));
        check(TreeNode.toList(codec.deserialize(codec.serialize(TreeNode.of()))), Arrays.asList());
        check(TreeNode.toList(codec.deserialize(codec.serialize(TreeNode.of(1, null, 2, 3)))), Arrays.asList(1, null, 2, 3));
    }
}
