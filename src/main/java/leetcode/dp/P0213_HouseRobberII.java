package leetcode.dp;

import static leetcode.common.Check.*;

/**
 * 213. House Robber II (Medium) - https://leetcode.com/problems/house-robber-ii/
 * <p>
 * Idea: TODO
 * Time O(?), Space O(?).
 */
public class P0213_HouseRobberII {
    public int rob(int[] nums) {
        // TODO
        return 0;
    }

    public static void main(String[] args) {
        P0213_HouseRobberII sol = new P0213_HouseRobberII();
        check(sol.rob(new int[]{2, 3, 2}), 3);
        check(sol.rob(new int[]{1, 2, 3, 1}), 4);
        check(sol.rob(new int[]{1, 2, 3}), 3);
    }
}
