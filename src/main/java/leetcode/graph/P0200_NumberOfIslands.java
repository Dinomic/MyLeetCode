package leetcode.graph;

import static leetcode.common.Check.*;

/**
 * 200. Number of Islands (Medium) - https://leetcode.com/problems/number-of-islands/
 * <p>
 * Idea: TODO
 * Time O(?), Space O(?).
 */
public class P0200_NumberOfIslands {
    public int numIslands(char[][] grid) {
        // TODO
        return 0;
    }

    public static void main(String[] args) {
        P0200_NumberOfIslands sol = new P0200_NumberOfIslands();
        check(sol.numIslands(new char[][]{
                {'1', '1', '1', '1', '0'},
                {'1', '1', '0', '1', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '0', '0'}}), 1);
        check(sol.numIslands(new char[][]{
                {'1', '1', '0', '0', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '1', '0', '0'},
                {'0', '0', '0', '1', '1'}}), 3);
    }
}
