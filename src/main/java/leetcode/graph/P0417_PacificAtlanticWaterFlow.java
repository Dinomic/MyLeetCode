package leetcode.graph;

import java.util.*;
import static leetcode.common.Check.*;

/**
 * 417. Pacific Atlantic Water Flow (Medium) - https://leetcode.com/problems/pacific-atlantic-water-flow/
 * <p>
 * Idea: TODO
 * Time O(?), Space O(?).
 */
public class P0417_PacificAtlanticWaterFlow {
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        // TODO
        return null;
    }

    public static void main(String[] args) {
        P0417_PacificAtlanticWaterFlow sol = new P0417_PacificAtlanticWaterFlow();
        checkSets(sol.pacificAtlantic(new int[][]{
                        {1, 2, 2, 3, 5},
                        {3, 2, 3, 4, 4},
                        {2, 4, 5, 3, 1},
                        {6, 7, 1, 4, 5},
                        {5, 1, 1, 2, 4}}),
                List.of(List.of(0, 4), List.of(1, 3), List.of(1, 4), List.of(2, 2), List.of(3, 0), List.of(3, 1), List.of(4, 0)));
        checkSets(sol.pacificAtlantic(new int[][]{{1}}), List.of(List.of(0, 0)));
    }
}
