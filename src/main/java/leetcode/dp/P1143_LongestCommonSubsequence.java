package leetcode.dp;

import static leetcode.common.Check.*;

/**
 * 1143. Longest Common Subsequence (Medium) - https://leetcode.com/problems/longest-common-subsequence/
 * <p>
 * Idea: TODO
 * Time O(?), Space O(?).
 */
public class P1143_LongestCommonSubsequence {
    public int longestCommonSubsequence(String text1, String text2) {
        // TODO
        return 0;
    }

    public static void main(String[] args) {
        P1143_LongestCommonSubsequence sol = new P1143_LongestCommonSubsequence();
        check(sol.longestCommonSubsequence("abcde", "ace"), 3);
        check(sol.longestCommonSubsequence("abc", "abc"), 3);
        check(sol.longestCommonSubsequence("abc", "def"), 0);
    }
}
