package leetcode.strings;

import static leetcode.common.Check.*;

/**
 * 290. Word Pattern (Easy) - https://leetcode.com/problems/word-pattern/
 * <p>
 * Idea: TODO
 * Time O(?), Space O(?).
 */
public class P0290_WordPattern {
    public boolean wordPattern(String pattern, String s) {
        // TODO
        return false;
    }

    public static void main(String[] args) {
        P0290_WordPattern sol = new P0290_WordPattern();
        check(sol.wordPattern("abba", "dog cat cat dog"), true);
        check(sol.wordPattern("abba", "dog cat cat fish"), false);
        check(sol.wordPattern("aaaa", "dog cat cat dog"), false);
        check(sol.wordPattern("abba", "dog dog dog dog"), false);
    }
}
