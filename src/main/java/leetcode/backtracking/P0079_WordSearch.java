package leetcode.backtracking;

import static leetcode.common.Check.*;

/**
 * 79. Word Search (Medium) - https://leetcode.com/problems/word-search/
 * <p>
 * Idea: TODO
 * Time O(?), Space O(?).
 */
public class P0079_WordSearch {
    public boolean exist(char[][] board, String word) {
        // TODO
        return false;
    }

    public static void main(String[] args) {
        P0079_WordSearch sol = new P0079_WordSearch();
        char[][] board = {{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}};
        check(sol.exist(board, "ABCCED"), true);
        check(sol.exist(board, "SEE"), true);
        check(sol.exist(board, "ABCB"), false);
    }
}
