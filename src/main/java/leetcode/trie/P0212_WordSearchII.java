package leetcode.trie;

import java.util.*;
import static leetcode.common.Check.*;

/**
 * 212. Word Search II (Hard) - https://leetcode.com/problems/word-search-ii/
 * <p>
 * Idea: TODO
 * Time O(?), Space O(?).
 */
public class P0212_WordSearchII {
    public List<String> findWords(char[][] board, String[] words) {
        // TODO
        return null;
    }

    public static void main(String[] args) {
        P0212_WordSearchII sol = new P0212_WordSearchII();
        checkAnyOrder(sol.findWords(new char[][]{
                {'o', 'a', 'a', 'n'},
                {'e', 't', 'a', 'e'},
                {'i', 'h', 'k', 'r'},
                {'i', 'f', 'l', 'v'}}, new String[]{"oath", "pea", "eat", "rain"}), List.of("eat", "oath"));
        checkAnyOrder(sol.findWords(new char[][]{{'a', 'b'}, {'c', 'd'}}, new String[]{"abcb"}), List.of());
    }
}
