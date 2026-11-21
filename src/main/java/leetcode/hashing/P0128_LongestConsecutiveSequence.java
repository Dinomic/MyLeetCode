package leetcode.hashing;

import static leetcode.common.Check.*;

/**
 * 128. Longest Consecutive Sequence (Medium) - https://leetcode.com/problems/longest-consecutive-sequence/
 * <p>
 * Idea: TODO
 * Time O(?), Space O(?).
 */
public class P0128_LongestConsecutiveSequence {
    public int longestConsecutive(int[] nums) {
        // TODO
        return 0;
    }

    public static void main(String[] args) {
        P0128_LongestConsecutiveSequence sol = new P0128_LongestConsecutiveSequence();
        check(sol.longestConsecutive(new int[]{100, 4, 200, 1, 3, 2}), 4);
        check(sol.longestConsecutive(new int[]{0, 3, 7, 2, 5, 8, 4, 6, 0, 1}), 9);
        check(sol.longestConsecutive(new int[]{1, 0, 1, 2}), 3);
        check(sol.longestConsecutive(new int[]{}), 0);
    }
}
