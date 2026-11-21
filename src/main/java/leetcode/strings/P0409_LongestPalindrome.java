package leetcode.strings;

import static leetcode.common.Check.*;

/**
 * 409. Longest Palindrome (Easy) - https://leetcode.com/problems/longest-palindrome/
 * <p>
 * Idea: TODO
 * Time O(?), Space O(?).
 */
public class P0409_LongestPalindrome {
    public int longestPalindrome(String s) {
        // TODO
        return 0;
    }

    public static void main(String[] args) {
        P0409_LongestPalindrome sol = new P0409_LongestPalindrome();
        check(sol.longestPalindrome("abccccdd"), 7);
        check(sol.longestPalindrome("a"), 1);
        check(sol.longestPalindrome("Aa"), 1);
    }
}
