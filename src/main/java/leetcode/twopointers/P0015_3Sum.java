package leetcode.twopointers;

import java.util.*;
import static leetcode.common.Check.*;

/**
 * 15. 3Sum (Medium) - https://leetcode.com/problems/3sum/
 * <p>
 * Idea: TODO
 * Time O(?), Space O(?).
 */
public class P0015_3Sum {
    public List<List<Integer>> threeSum(int[] nums) {
        // TODO
        return null;
    }

    public static void main(String[] args) {
        P0015_3Sum sol = new P0015_3Sum();
        checkSets(sol.threeSum(new int[]{-1, 0, 1, 2, -1, -4}), List.of(List.of(-1, -1, 2), List.of(-1, 0, 1)));
        checkSets(sol.threeSum(new int[]{0, 1, 1}), List.<List<Integer>>of());
        checkSets(sol.threeSum(new int[]{0, 0, 0}), List.of(List.of(0, 0, 0)));
    }
}
