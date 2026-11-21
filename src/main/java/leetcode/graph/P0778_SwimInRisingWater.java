package leetcode.graph;

import static leetcode.common.Check.*;

/**
 * 778. Swim in Rising Water (Hard) - https://leetcode.com/problems/swim-in-rising-water/
 * <p>
 * Idea: TODO
 * Time O(?), Space O(?).
 */
public class P0778_SwimInRisingWater {
    public int swimInWater(int[][] grid) {
        // TODO
        return 0;
    }

    public static void main(String[] args) {
        P0778_SwimInRisingWater sol = new P0778_SwimInRisingWater();
        check(sol.swimInWater(new int[][]{{0, 2}, {1, 3}}), 3);
        check(sol.swimInWater(new int[][]{
                {0, 1, 2, 3, 4},
                {24, 23, 22, 21, 5},
                {12, 13, 14, 15, 16},
                {11, 17, 18, 19, 20},
                {10, 9, 8, 7, 6}}), 16);
    }
}
