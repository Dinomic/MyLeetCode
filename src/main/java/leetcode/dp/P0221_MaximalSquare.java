package leetcode.dp;

import static leetcode.common.Check.*;

/**
 * 221. Maximal Square (Medium) - https://leetcode.com/problems/maximal-square/
 * <p>
 * Idea: TODO
 * Time O(?), Space O(?).
 */
public class P0221_MaximalSquare {
    public int maximalSquare(char[][] matrix) {
        // TODO
        return 0;
    }

    public static void main(String[] args) {
        P0221_MaximalSquare sol = new P0221_MaximalSquare();
        check(sol.maximalSquare(new char[][]{
                {'1', '0', '1', '0', '0'},
                {'1', '0', '1', '1', '1'},
                {'1', '1', '1', '1', '1'},
                {'1', '0', '0', '1', '0'}}), 4);
        check(sol.maximalSquare(new char[][]{{'0', '1'}, {'1', '0'}}), 1);
        check(sol.maximalSquare(new char[][]{{'0'}}), 0);
    }
}
