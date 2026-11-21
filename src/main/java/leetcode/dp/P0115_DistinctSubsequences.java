package leetcode.dp;

import static leetcode.common.Check.*;

/**
 * 115. Distinct Subsequences (Hard) - https://leetcode.com/problems/distinct-subsequences/
 * <p>
 * Idea: TODO
 * Time O(?), Space O(?).
 */
public class P0115_DistinctSubsequences {
    public int numDistinct(String s, String t) {
        // TODO
        return 0;
    }

    public static void main(String[] args) {
        P0115_DistinctSubsequences sol = new P0115_DistinctSubsequences();
        check(sol.numDistinct("rabbbit", "rabbit"), 3);
        check(sol.numDistinct("babgbag", "bag"), 5);
    }
}
