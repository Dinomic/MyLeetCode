package leetcode.dp;

import static leetcode.common.Check.*;

/**
 * 300. Longest Increasing Subsequence (Medium) - https://leetcode.com/problems/longest-increasing-subsequence/
 * <p>
 * Idea: TODO
 * Time O(?), Space O(?).
 */
public class P0300_LongestIncreasingSubsequence {
    public int lengthOfLIS(int[] nums) {
        // TODO
        return 0;
    }

    public static void main(String[] args) {
        P0300_LongestIncreasingSubsequence sol = new P0300_LongestIncreasingSubsequence();
        check(sol.lengthOfLIS(new int[]{10, 9, 2, 5, 3, 7, 101, 18}), 4);
        check(sol.lengthOfLIS(new int[]{0, 1, 0, 3, 2, 3}), 4);
        check(sol.lengthOfLIS(new int[]{7, 7, 7, 7, 7, 7, 7}), 1);
    }
}
