package leetcode.backtracking;

import java.util.*;
import static leetcode.common.Check.*;

/**
 * 39. Combination Sum (Medium) - https://leetcode.com/problems/combination-sum/
 * <p>
 * Idea: TODO
 * Time O(?), Space O(?).
 */
public class P0039_CombinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        // TODO
        return null;
    }

    public static void main(String[] args) {
        P0039_CombinationSum sol = new P0039_CombinationSum();
        checkSets(sol.combinationSum(new int[]{2, 3, 6, 7}, 7), List.of(List.of(2, 2, 3), List.of(7)));
        checkSets(sol.combinationSum(new int[]{2, 3, 5}, 8), List.of(List.of(2, 2, 2, 2), List.of(2, 3, 3), List.of(3, 5)));
        checkSets(sol.combinationSum(new int[]{2}, 1), List.<List<Integer>>of());
    }
}
