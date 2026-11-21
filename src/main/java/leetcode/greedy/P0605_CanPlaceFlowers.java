package leetcode.greedy;

import static leetcode.common.Check.*;

/**
 * 605. Can Place Flowers (Easy) - https://leetcode.com/problems/can-place-flowers/
 * <p>
 * Idea: TODO
 * Time O(?), Space O(?).
 */
public class P0605_CanPlaceFlowers {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        // TODO
        return false;
    }

    public static void main(String[] args) {
        P0605_CanPlaceFlowers sol = new P0605_CanPlaceFlowers();
        check(sol.canPlaceFlowers(new int[]{1, 0, 0, 0, 1}, 1), true);
        check(sol.canPlaceFlowers(new int[]{1, 0, 0, 0, 1}, 2), false);
    }
}
