package leetcode.backtracking;

import java.util.*;
import static leetcode.common.Check.*;

/**
 * 47. Permutations II (Medium) - https://leetcode.com/problems/permutations-ii/
 * <p>
 * Idea: TODO
 * Time O(?), Space O(?).
 */
public class P0047_PermutationsII {
    public List<List<Integer>> permuteUnique(int[] nums) {
        // TODO
        return null;
    }

    public static void main(String[] args) {
        P0047_PermutationsII sol = new P0047_PermutationsII();
        checkAnyOrder(sol.permuteUnique(new int[]{1, 1, 2}), List.of(List.of(1, 1, 2), List.of(1, 2, 1), List.of(2, 1, 1)));
        checkAnyOrder(sol.permuteUnique(new int[]{1, 2, 3}),
                List.of(List.of(1, 2, 3), List.of(1, 3, 2), List.of(2, 1, 3), List.of(2, 3, 1), List.of(3, 1, 2), List.of(3, 2, 1)));
    }
}
