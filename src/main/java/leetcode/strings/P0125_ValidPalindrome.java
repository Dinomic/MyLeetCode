package leetcode.strings;

import static leetcode.common.Check.*;

/**
 * 125. Valid Palindrome (Easy) - https://leetcode.com/problems/valid-palindrome/
 * <p>
 * Idea: TODO
 * Time O(?), Space O(?).
 */
public class P0125_ValidPalindrome {
//    public boolean isPalindrome(String s) {
//        String result = s.replaceAll("[^a-zA-Z]", "").toLowerCase();
//        for (int i = 0; i < result.length()/2; i++){
//            if (result.charAt(i) != result.charAt(result.length() - 1 - i)) return false;
//        }
//        return true;
//    }

    //using codePointAt would be much less time-consuming
    public boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            while (!isAlphanumeric(s.codePointAt(i)) && i < s.length() - 1) {
                i++;
            }

            while (!isAlphanumeric(s.codePointAt(j)) && j > 0) {
                j--;
            }

            if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j)) && i <= j) return false;

            i++;
            j--;
        }
        return true;
    }

    boolean isAlphanumeric(final int codePoint) {
        return (codePoint >= 65 && codePoint <= 90) ||
            (codePoint >= 97 && codePoint <= 122) ||
            (codePoint >= 48 && codePoint <= 57);
    }

    public static void main(String[] args) {
        P0125_ValidPalindrome sol = new P0125_ValidPalindrome();
        check(sol.isPalindrome("A man, a plan, a canal: Panama"), true);
        check(sol.isPalindrome("race a car"), false);
        check(sol.isPalindrome("0P"), true);
    }
}
