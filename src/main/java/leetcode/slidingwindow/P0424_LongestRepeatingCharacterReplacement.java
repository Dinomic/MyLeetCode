package leetcode.slidingwindow;

import static leetcode.common.Check.*;

/**
 * 424. Longest Repeating Character Replacement (Medium) - https://leetcode.com/problems/longest-repeating-character-replacement/
 * <p>
 * Idea: TODO
 * Time O(?), Space O(?).
 */
public class P0424_LongestRepeatingCharacterReplacement {
    public int characterReplacement(String s, int k) {
        // TODO
        return 0;
    }

    public static void main(String[] args) {
        P0424_LongestRepeatingCharacterReplacement sol = new P0424_LongestRepeatingCharacterReplacement();
        check(sol.characterReplacement("ABAB", 2), 4);
        check(sol.characterReplacement("AABABBA", 1), 4);
    }
}
