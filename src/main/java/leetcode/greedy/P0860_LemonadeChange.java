package leetcode.greedy;

import static leetcode.common.Check.*;

/**
 * 860. Lemonade Change (Easy) - https://leetcode.com/problems/lemonade-change/
 * <p>
 * Idea: TODO
 * Time O(?), Space O(?).
 */
public class P0860_LemonadeChange {
    public boolean lemonadeChange(int[] bills) {
        // TODO
        return false;
    }

    public static void main(String[] args) {
        P0860_LemonadeChange sol = new P0860_LemonadeChange();
        check(sol.lemonadeChange(new int[]{5, 5, 5, 10, 20}), true);
        check(sol.lemonadeChange(new int[]{5, 5, 10, 10, 20}), false);
    }
}
