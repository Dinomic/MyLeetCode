package leetcode.dp;

import java.util.*;
import static leetcode.common.Check.*;

/**
 * 120. Triangle (Medium) - https://leetcode.com/problems/triangle/
 * <p>
 * Idea: TODO
 * Time O(?), Space O(?).
 */
public class P0120_Triangle {
    public int minimumTotal(List<List<Integer>> triangle) {
        // TODO
        return 0;
    }

    public static void main(String[] args) {
        P0120_Triangle sol = new P0120_Triangle();
        check(sol.minimumTotal(List.of(List.of(2), List.of(3, 4), List.of(6, 5, 7), List.of(4, 1, 8, 3))), 11);
        check(sol.minimumTotal(List.of(List.of(-10))), -10);
    }
}
