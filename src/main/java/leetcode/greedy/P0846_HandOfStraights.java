package leetcode.greedy;

import static leetcode.common.Check.*;

/**
 * 846. Hand of Straights (Medium) - https://leetcode.com/problems/hand-of-straights/
 * <p>
 * Idea: TODO
 * Time O(?), Space O(?).
 */
public class P0846_HandOfStraights {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        // TODO
        return false;
    }

    public static void main(String[] args) {
        P0846_HandOfStraights sol = new P0846_HandOfStraights();
        check(sol.isNStraightHand(new int[]{1, 2, 3, 6, 2, 3, 4, 7, 8}, 3), true);
        check(sol.isNStraightHand(new int[]{1, 2, 3, 4, 5}, 4), false);
    }
}
