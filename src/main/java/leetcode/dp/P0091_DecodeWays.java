package leetcode.dp;

import static leetcode.common.Check.*;

/**
 * 91. Decode Ways (Medium) - https://leetcode.com/problems/decode-ways/
 * <p>
 * Idea: TODO
 * Time O(?), Space O(?).
 */
public class P0091_DecodeWays {
    public int numDecodings(String s) {
        // TODO
        return 0;
    }

    public static void main(String[] args) {
        P0091_DecodeWays sol = new P0091_DecodeWays();
        check(sol.numDecodings("12"), 2);
        check(sol.numDecodings("226"), 3);
        check(sol.numDecodings("06"), 0);
    }
}
