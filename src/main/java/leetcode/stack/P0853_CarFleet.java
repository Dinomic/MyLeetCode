package leetcode.stack;

import static leetcode.common.Check.*;

/**
 * 853. Car Fleet (Medium) - https://leetcode.com/problems/car-fleet/
 * <p>
 * Idea: TODO
 * Time O(?), Space O(?).
 */
public class P0853_CarFleet {
    public int carFleet(int target, int[] position, int[] speed) {
        // TODO
        return 0;
    }

    public static void main(String[] args) {
        P0853_CarFleet sol = new P0853_CarFleet();
        check(sol.carFleet(12, new int[]{10, 8, 0, 5, 3}, new int[]{2, 4, 1, 1, 3}), 3);
        check(sol.carFleet(10, new int[]{3}, new int[]{3}), 1);
        check(sol.carFleet(100, new int[]{0, 2, 4}, new int[]{4, 2, 1}), 1);
    }
}
