package leetcode.binarysearch;

import static leetcode.common.Check.*;

/**
 * 875. Koko Eating Bananas (Medium) - https://leetcode.com/problems/koko-eating-bananas/
 * <p>
 * Idea: TODO
 * Time O(?), Space O(?).
 */
public class P0875_KokoEatingBananas {
    public int minEatingSpeed(int[] piles, int h) {
        // TODO
        return 0;
    }

    public static void main(String[] args) {
        P0875_KokoEatingBananas sol = new P0875_KokoEatingBananas();
        check(sol.minEatingSpeed(new int[]{3, 6, 7, 11}, 8), 4);
        check(sol.minEatingSpeed(new int[]{30, 11, 23, 4, 20}, 5), 30);
        check(sol.minEatingSpeed(new int[]{30, 11, 23, 4, 20}, 6), 23);
    }
}
