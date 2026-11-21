package leetcode.dp;

import static leetcode.common.Check.*;

/**
 * 97. Interleaving String (Medium) - https://leetcode.com/problems/interleaving-string/
 * <p>
 * Idea: TODO
 * Time O(?), Space O(?).
 */
public class P0097_InterleavingString {
    public boolean isInterleave(String s1, String s2, String s3) {
        // TODO
        return false;
    }

    public static void main(String[] args) {
        P0097_InterleavingString sol = new P0097_InterleavingString();
        check(sol.isInterleave("aabcc", "dbbca", "aadbbcbcac"), true);
        check(sol.isInterleave("aabcc", "dbbca", "aadbbbaccc"), false);
        check(sol.isInterleave("", "", ""), true);
    }
}
