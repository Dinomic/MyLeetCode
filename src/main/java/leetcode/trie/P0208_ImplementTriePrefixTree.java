package leetcode.trie;

import static leetcode.common.Check.*;

/**
 * 208. Implement Trie (Prefix Tree) (Medium) - https://leetcode.com/problems/implement-trie-prefix-tree/
 * <p>
 * Idea: TODO
 * Time O(?), Space O(?).
 */
public class P0208_ImplementTriePrefixTree {
    public P0208_ImplementTriePrefixTree() {
    }

    public void insert(String word) {
        // TODO
    }

    public boolean search(String word) {
        // TODO
        return false;
    }

    public boolean startsWith(String prefix) {
        // TODO
        return false;
    }

    public static void main(String[] args) {
        P0208_ImplementTriePrefixTree trie = new P0208_ImplementTriePrefixTree();
        trie.insert("apple");
        check(trie.search("apple"), true);
        check(trie.search("app"), false);
        check(trie.startsWith("app"), true);
        trie.insert("app");
        check(trie.search("app"), true);
    }
}
