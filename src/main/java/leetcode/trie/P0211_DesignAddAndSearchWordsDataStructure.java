package leetcode.trie;

import static leetcode.common.Check.*;

/**
 * 211. Design Add and Search Words Data Structure (Medium) - https://leetcode.com/problems/design-add-and-search-words-data-structure/
 * <p>
 * Idea: TODO
 * Time O(?), Space O(?).
 */
public class P0211_DesignAddAndSearchWordsDataStructure {
    public P0211_DesignAddAndSearchWordsDataStructure() {
    }

    public void addWord(String word) {
        // TODO
    }

    /** word may contain '.', which matches any single letter. */
    public boolean search(String word) {
        // TODO
        return false;
    }

    public static void main(String[] args) {
        P0211_DesignAddAndSearchWordsDataStructure dict = new P0211_DesignAddAndSearchWordsDataStructure();
        dict.addWord("bad");
        dict.addWord("dad");
        dict.addWord("mad");
        check(dict.search("pad"), false);
        check(dict.search("bad"), true);
        check(dict.search(".ad"), true);
        check(dict.search("b.."), true);
    }
}
