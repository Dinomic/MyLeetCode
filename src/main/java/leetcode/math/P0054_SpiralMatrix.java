package leetcode.math;

import java.util.*;
import static leetcode.common.Check.*;

/**
 * 54. Spiral Matrix (Medium) - https://leetcode.com/problems/spiral-matrix/
 * <p>
 * Idea: TODO
 * Time O(?), Space O(?).
 */
public class P0054_SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        // TODO
        return null;
    }

    public static void main(String[] args) {
        P0054_SpiralMatrix sol = new P0054_SpiralMatrix();
        check(sol.spiralOrder(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}), List.of(1, 2, 3, 6, 9, 8, 7, 4, 5));
        check(sol.spiralOrder(new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}}), List.of(1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7));
    }
}
