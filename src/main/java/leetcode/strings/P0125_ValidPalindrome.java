package leetcode.strings;

import static leetcode.common.Check.*;

/**
 * 125. Valid Palindrome (Easy) - https://leetcode.com/problems/valid-palindrome/
 * <p>
 * Idea: TODO
 * Time O(?), Space O(?).
 */
public class P0125_ValidPalindrome {
    public boolean isPalindrome(String s) {
        // TODO
        return false;
    }

    public static void main(String[] args) {
        P0125_ValidPalindrome sol = new P0125_ValidPalindrome();
        check(sol.isPalindrome("A man, a plan, a canal: Panama"), true);
        check(sol.isPalindrome("race a car"), false);
        check(sol.isPalindrome(" "), true);
    }
}
