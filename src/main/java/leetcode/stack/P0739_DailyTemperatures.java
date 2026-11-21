package leetcode.stack;

import static leetcode.common.Check.*;

/**
 * 739. Daily Temperatures (Medium) - https://leetcode.com/problems/daily-temperatures/
 * <p>
 * Idea: TODO
 * Time O(?), Space O(?).
 */
public class P0739_DailyTemperatures {
    public int[] dailyTemperatures(int[] temperatures) {
        // TODO
        return null;
    }

    public static void main(String[] args) {
        P0739_DailyTemperatures sol = new P0739_DailyTemperatures();
        check(sol.dailyTemperatures(new int[]{73, 74, 75, 71, 69, 72, 76, 73}), new int[]{1, 1, 4, 2, 1, 1, 0, 0});
        check(sol.dailyTemperatures(new int[]{30, 40, 50, 60}), new int[]{1, 1, 1, 0});
        check(sol.dailyTemperatures(new int[]{30, 60, 90}), new int[]{1, 1, 0});
    }
}
