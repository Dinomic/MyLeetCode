package leetcode.backtracking;

import java.util.*;
import static leetcode.common.Check.*;

/**
 * 90. Subsets II (Medium) - https://leetcode.com/problems/subsets-ii/
 * <p>
 * Idea: TODO
 * Time O(?), Space O(?).
 */
public class P0090_SubsetsII {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        // TODO
        return null;
    }

    public static void main(String[] args) {
        P0090_SubsetsII sol = new P0090_SubsetsII();
        checkSets(sol.subsetsWithDup(new int[]{1, 2, 2}),
                List.of(List.of(), List.of(1), List.of(1, 2), List.of(1, 2, 2), List.of(2), List.of(2, 2)));
        checkSets(sol.subsetsWithDup(new int[]{0}), List.of(List.of(), List.of(0)));
    }
}
