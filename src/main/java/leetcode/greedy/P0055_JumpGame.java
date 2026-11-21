package leetcode.greedy;

import static leetcode.common.Check.*;

/**
 * 55. Jump Game (Medium) - https://leetcode.com/problems/jump-game/
 * <p>
 * Idea: TODO
 * Time O(?), Space O(?).
 */
public class P0055_JumpGame {
    public boolean canJump(int[] nums) {
        // TODO
        return false;
    }

    public static void main(String[] args) {
        P0055_JumpGame sol = new P0055_JumpGame();
        check(sol.canJump(new int[]{2, 3, 1, 1, 4}), true);
        check(sol.canJump(new int[]{3, 2, 1, 0, 4}), false);
    }
}
