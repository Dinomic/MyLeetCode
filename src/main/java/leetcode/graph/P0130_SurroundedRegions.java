package leetcode.graph;

import static leetcode.common.Check.*;

/**
 * 130. Surrounded Regions (Medium) - https://leetcode.com/problems/surrounded-regions/
 * <p>
 * Idea: TODO
 * Time O(?), Space O(?).
 */
public class P0130_SurroundedRegions {
    public void solve(char[][] board) {
        // TODO
    }

    public static void main(String[] args) {
        P0130_SurroundedRegions sol = new P0130_SurroundedRegions();
        char[][] a = {{'X', 'X', 'X', 'X'}, {'X', 'O', 'O', 'X'}, {'X', 'X', 'O', 'X'}, {'X', 'O', 'X', 'X'}};
        sol.solve(a);
        check(a, new char[][]{{'X', 'X', 'X', 'X'}, {'X', 'X', 'X', 'X'}, {'X', 'X', 'X', 'X'}, {'X', 'O', 'X', 'X'}});
        char[][] b = {{'X'}};
        sol.solve(b);
        check(b, new char[][]{{'X'}});
    }
}
