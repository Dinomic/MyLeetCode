package leetcode.slidingwindow;

import static leetcode.common.Check.*;

/**
 * 567. Permutation in String (Medium) - https://leetcode.com/problems/permutation-in-string/
 * <p>
 * Idea: TODO
 * Time O(?), Space O(?).
 */
public class P0567_PermutationInString {
    public boolean checkInclusion(String s1, String s2) {
        // TODO
        return false;
    }

    public static void main(String[] args) {
        P0567_PermutationInString sol = new P0567_PermutationInString();
        check(sol.checkInclusion("ab", "eidbaooo"), true);
        check(sol.checkInclusion("ab", "eidboaoo"), false);
    }
}
