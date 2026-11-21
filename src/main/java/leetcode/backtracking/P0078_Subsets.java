package leetcode.backtracking;

import java.util.*;
import static leetcode.common.Check.*;

/**
 * 78. Subsets (Medium) - https://leetcode.com/problems/subsets/
 * <p>
 * Idea: TODO
 * Time O(?), Space O(?).
 */
public class P0078_Subsets {
    public List<List<Integer>> subsets(int[] nums) {
        // TODO
        return null;
    }

    public static void main(String[] args) {
        P0078_Subsets sol = new P0078_Subsets();
        checkSets(sol.subsets(new int[]{1, 2, 3}),
                List.of(List.of(), List.of(1), List.of(2), List.of(1, 2), List.of(3), List.of(1, 3), List.of(2, 3), List.of(1, 2, 3)));
        checkSets(sol.subsets(new int[]{0}), List.of(List.of(), List.of(0)));
    }
}
