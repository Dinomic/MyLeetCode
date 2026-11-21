package leetcode.backtracking;

import java.util.*;
import static leetcode.common.Check.*;

/**
 * 46. Permutations (Medium) - https://leetcode.com/problems/permutations/
 * <p>
 * Idea: TODO
 * Time O(?), Space O(?).
 */
public class P0046_Permutations {
    public List<List<Integer>> permute(int[] nums) {
        // TODO
        return null;
    }

    public static void main(String[] args) {
        P0046_Permutations sol = new P0046_Permutations();
        checkAnyOrder(sol.permute(new int[]{1, 2, 3}),
                List.of(List.of(1, 2, 3), List.of(1, 3, 2), List.of(2, 1, 3), List.of(2, 3, 1), List.of(3, 1, 2), List.of(3, 2, 1)));
        checkAnyOrder(sol.permute(new int[]{0, 1}), List.of(List.of(0, 1), List.of(1, 0)));
        checkAnyOrder(sol.permute(new int[]{1}), List.of(List.of(1)));
    }
}
