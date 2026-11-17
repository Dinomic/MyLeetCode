package leetcode.hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;

/**
 * 1. Two Sum (Easy) - https://leetcode.com/problems/two-sum/
 * <p>
 * Idea: store value -> index; for each number look up its complement.
 * Time O(n), Space O(n).
 */
public class P0001_TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> seen = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            Integer j = seen.get(target - nums[i]);
            if (j != null) {
                return new int[]{j, i};
            }
            seen.put(nums[i], i);
        }
        return null;
    }

    public static void main(String[] args) {
        P0001_TwoSum sol = new P0001_TwoSum();
        System.out.println(Arrays.toString(sol.twoSum(new int[]{2, 7, 11, 15}, 9)));
        System.out.println(Arrays.toString(sol.twoSum(new int[]{3, 2, 4}, 6)));
        System.out.println(Arrays.toString(sol.twoSum(new int[]{3, 3}, 6)));
        System.out.println(Arrays.toString(sol.twoSum(new int[]{1, 2}, 10)));
    }
}
