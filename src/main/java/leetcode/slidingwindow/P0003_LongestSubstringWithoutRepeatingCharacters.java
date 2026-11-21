package leetcode.slidingwindow;

import static leetcode.common.Check.*;

/**
 * 3. Longest Substring Without Repeating Characters (Medium) - https://leetcode.com/problems/longest-substring-without-repeating-characters/
 * <p>
 * Idea: TODO
 * Time O(?), Space O(?).
 */
public class P0003_LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        // TODO
        return 0;
    }

    public static void main(String[] args) {
        P0003_LongestSubstringWithoutRepeatingCharacters sol = new P0003_LongestSubstringWithoutRepeatingCharacters();
        check(sol.lengthOfLongestSubstring("abcabcbb"), 3);
        check(sol.lengthOfLongestSubstring("bbbbb"), 1);
        check(sol.lengthOfLongestSubstring("pwwkew"), 3);
        check(sol.lengthOfLongestSubstring(""), 0);
    }
}
