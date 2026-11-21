package leetcode.slidingwindow;

import static leetcode.common.Check.*;

/**
 * 76. Minimum Window Substring (Hard) - https://leetcode.com/problems/minimum-window-substring/
 * <p>
 * Idea: TODO
 * Time O(?), Space O(?).
 */
public class P0076_MinimumWindowSubstring {
    public String minWindow(String s, String t) {
        // TODO
        return null;
    }

    public static void main(String[] args) {
        P0076_MinimumWindowSubstring sol = new P0076_MinimumWindowSubstring();
        check(sol.minWindow("ADOBECODEBANC", "ABC"), "BANC");
        check(sol.minWindow("a", "a"), "a");
        check(sol.minWindow("a", "aa"), "");
    }
}
