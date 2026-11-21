package leetcode.dp;

import static leetcode.common.Check.*;

/**
 * 72. Edit Distance (Medium) - https://leetcode.com/problems/edit-distance/
 * <p>
 * Idea: TODO
 * Time O(?), Space O(?).
 */
public class P0072_EditDistance {
    public int minDistance(String word1, String word2) {
        // TODO
        return 0;
    }

    public static void main(String[] args) {
        P0072_EditDistance sol = new P0072_EditDistance();
        check(sol.minDistance("horse", "ros"), 3);
        check(sol.minDistance("intention", "execution"), 5);
    }
}
