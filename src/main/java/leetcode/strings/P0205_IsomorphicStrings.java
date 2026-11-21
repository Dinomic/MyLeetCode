package leetcode.strings;

import static leetcode.common.Check.*;

/**
 * 205. Isomorphic Strings (Easy) - https://leetcode.com/problems/isomorphic-strings/
 * <p>
 * Idea: TODO
 * Time O(?), Space O(?).
 */
public class P0205_IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        // TODO
        return false;
    }

    public static void main(String[] args) {
        P0205_IsomorphicStrings sol = new P0205_IsomorphicStrings();
        check(sol.isIsomorphic("egg", "add"), true);
        check(sol.isIsomorphic("foo", "bar"), false);
        check(sol.isIsomorphic("paper", "title"), true);
        check(sol.isIsomorphic("badc", "baba"), false);
    }
}
