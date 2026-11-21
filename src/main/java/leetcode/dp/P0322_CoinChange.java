package leetcode.dp;

import static leetcode.common.Check.*;

/**
 * 322. Coin Change (Medium) - https://leetcode.com/problems/coin-change/
 * <p>
 * Idea: TODO
 * Time O(?), Space O(?).
 */
public class P0322_CoinChange {
    public int coinChange(int[] coins, int amount) {
        // TODO
        return 0;
    }

    public static void main(String[] args) {
        P0322_CoinChange sol = new P0322_CoinChange();
        check(sol.coinChange(new int[]{1, 2, 5}, 11), 3);
        check(sol.coinChange(new int[]{2}, 3), -1);
        check(sol.coinChange(new int[]{1}, 0), 0);
    }
}
