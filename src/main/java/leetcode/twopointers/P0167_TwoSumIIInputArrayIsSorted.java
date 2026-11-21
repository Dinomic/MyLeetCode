package leetcode.twopointers;

import static leetcode.common.Check.*;

/**
 * 167. Two Sum II - Input Array Is Sorted (Medium) - https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
 * <p>
 * Idea: TODO
 * Time O(?), Space O(?).
 */
public class P0167_TwoSumIIInputArrayIsSorted {
    public int[] twoSum(int[] numbers, int target) {
        // TODO
        return null;
    }

    public static void main(String[] args) {
        P0167_TwoSumIIInputArrayIsSorted sol = new P0167_TwoSumIIInputArrayIsSorted();
        check(sol.twoSum(new int[]{2, 7, 11, 15}, 9), new int[]{1, 2});
        check(sol.twoSum(new int[]{2, 3, 4}, 6), new int[]{1, 3});
        check(sol.twoSum(new int[]{-1, 0}, -1), new int[]{1, 2});
    }
}
