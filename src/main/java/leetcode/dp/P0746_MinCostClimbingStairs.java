package leetcode.dp;

import static leetcode.common.Check.*;

/**
 * 746. Min Cost Climbing Stairs (Easy) - https://leetcode.com/problems/min-cost-climbing-stairs/
 * <p>
 * Idea: TODO
 * Time O(?), Space O(?).
 */
public class P0746_MinCostClimbingStairs {
    public int minCostClimbingStairs(int[] cost) {
        // TODO
        return 0;
    }

    public static void main(String[] args) {
        P0746_MinCostClimbingStairs sol = new P0746_MinCostClimbingStairs();
        check(sol.minCostClimbingStairs(new int[]{10, 15, 20}), 15);
        check(sol.minCostClimbingStairs(new int[]{1, 100, 1, 1, 1, 100, 1, 1, 100, 1}), 6);
    }
}
