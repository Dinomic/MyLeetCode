package leetcode.backtracking;

import java.util.*;
import static leetcode.common.Check.*;

/**
 * 40. Combination Sum II (Medium) - https://leetcode.com/problems/combination-sum-ii/
 * <p>
 * Idea: TODO
 * Time O(?), Space O(?).
 */
public class P0040_CombinationSumII {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        // TODO
        return null;
    }

    public static void main(String[] args) {
        P0040_CombinationSumII sol = new P0040_CombinationSumII();
        checkSets(sol.combinationSum2(new int[]{10, 1, 2, 7, 6, 1, 5}, 8),
                List.of(List.of(1, 1, 6), List.of(1, 2, 5), List.of(1, 7), List.of(2, 6)));
        checkSets(sol.combinationSum2(new int[]{2, 5, 2, 1, 2}, 5), List.of(List.of(1, 2, 2), List.of(5)));
    }
}
