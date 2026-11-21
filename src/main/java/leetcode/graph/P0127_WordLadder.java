package leetcode.graph;

import java.util.*;
import static leetcode.common.Check.*;

/**
 * 127. Word Ladder (Hard) - https://leetcode.com/problems/word-ladder/
 * <p>
 * Idea: TODO
 * Time O(?), Space O(?).
 */
public class P0127_WordLadder {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        // TODO
        return 0;
    }

    public static void main(String[] args) {
        P0127_WordLadder sol = new P0127_WordLadder();
        check(sol.ladderLength("hit", "cog", List.of("hot", "dot", "dog", "lot", "log", "cog")), 5);
        check(sol.ladderLength("hit", "cog", List.of("hot", "dot", "dog", "lot", "log")), 0);
    }
}
