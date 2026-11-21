package leetcode.backtracking;

import java.util.*;
import static leetcode.common.Check.*;

/**
 * 51. N-Queens (Hard) - https://leetcode.com/problems/n-queens/
 * <p>
 * Idea: TODO
 * Time O(?), Space O(?).
 */
public class P0051_NQueens {
    public List<List<String>> solveNQueens(int n) {
        // TODO
        return null;
    }

    public static void main(String[] args) {
        P0051_NQueens sol = new P0051_NQueens();
        checkAnyOrder(sol.solveNQueens(4),
                List.of(List.of(".Q..", "...Q", "Q...", "..Q."), List.of("..Q.", "Q...", "...Q", ".Q..")));
        checkAnyOrder(sol.solveNQueens(1), List.of(List.of("Q")));
    }
}
