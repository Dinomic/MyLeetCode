package leetcode.slidingwindow;

import static leetcode.common.Check.*;

/**
 * 121. Best Time to Buy and Sell Stock (Easy) - https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
 * <p>
 * Idea: TODO
 * Time O(?), Space O(?).
 */
public class P0121_BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        // TODO
        return 0;
    }

    public static void main(String[] args) {
        P0121_BestTimeToBuyAndSellStock sol = new P0121_BestTimeToBuyAndSellStock();
        check(sol.maxProfit(new int[]{7, 1, 5, 3, 6, 4}), 5);
        check(sol.maxProfit(new int[]{7, 6, 4, 3, 1}), 0);
    }
}
