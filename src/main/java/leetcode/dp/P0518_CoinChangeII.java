package leetcode.dp;

import static leetcode.common.Check.*;

/**
 * 518. Coin Change II (Medium) - https://leetcode.com/problems/coin-change-ii/
 * <p>
 * Idea: TODO
 * Time O(?), Space O(?).
 */
public class P0518_CoinChangeII {
    public int change(int amount, int[] coins) {
        // TODO
        return 0;
    }

    public static void main(String[] args) {
        P0518_CoinChangeII sol = new P0518_CoinChangeII();
        check(sol.change(5, new int[]{1, 2, 5}), 4);
        check(sol.change(3, new int[]{2}), 0);
        check(sol.change(10, new int[]{10}), 1);
    }
}
