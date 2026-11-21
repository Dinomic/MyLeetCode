package leetcode.dp;

import static leetcode.common.Check.*;

/**
 * 198. House Robber (Medium) - https://leetcode.com/problems/house-robber/
 * <p>
 * Idea: TODO
 * Time O(?), Space O(?).
 */
public class P0198_HouseRobber {
    public int rob(int[] nums) {
        // TODO
        return 0;
    }

    public static void main(String[] args) {
        P0198_HouseRobber sol = new P0198_HouseRobber();
        check(sol.rob(new int[]{1, 2, 3, 1}), 4);
        check(sol.rob(new int[]{2, 7, 9, 3, 1}), 12);
    }
}
