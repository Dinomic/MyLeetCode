package leetcode.bitmanipulation;

import static leetcode.common.Check.*;

/**
 * 338. Counting Bits (Easy) - https://leetcode.com/problems/counting-bits/
 * <p>
 * Idea: TODO
 * Time O(?), Space O(?).
 */
public class P0338_CountingBits {
    public int[] countBits(int n) {
        // TODO
        return null;
    }

    public static void main(String[] args) {
        P0338_CountingBits sol = new P0338_CountingBits();
        check(sol.countBits(2), new int[]{0, 1, 1});
        check(sol.countBits(5), new int[]{0, 1, 1, 2, 1, 2});
    }
}
