package leetcode.math;

import static leetcode.common.Check.*;

/**
 * 202. Happy Number (Easy) - https://leetcode.com/problems/happy-number/
 * <p>
 * Idea: TODO
 * Time O(?), Space O(?).
 */
public class P0202_HappyNumber {
    public boolean isHappy(int n) {
        // TODO
        return false;
    }

    public static void main(String[] args) {
        P0202_HappyNumber sol = new P0202_HappyNumber();
        check(sol.isHappy(19), true);
        check(sol.isHappy(2), false);
        check(sol.isHappy(1), true);
    }
}
