package leetcode.strings;

import static leetcode.common.Check.*;

/**
 * 14. Longest Common Prefix (Easy) - https://leetcode.com/problems/longest-common-prefix/
 * <p>
 * Idea: TODO
 * Time O(?), Space O(?).
 */
public class P0014_LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        // TODO
        return null;
    }

    public static void main(String[] args) {
        P0014_LongestCommonPrefix sol = new P0014_LongestCommonPrefix();
        check(sol.longestCommonPrefix(new String[]{"flower", "flow", "flight"}), "fl");
        check(sol.longestCommonPrefix(new String[]{"dog", "racecar", "car"}), "");
        check(sol.longestCommonPrefix(new String[]{"a"}), "a");
    }
}
