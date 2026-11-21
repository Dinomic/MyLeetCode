package leetcode.greedy;

import static leetcode.common.Check.*;

/**
 * 134. Gas Station (Medium) - https://leetcode.com/problems/gas-station/
 * <p>
 * Idea: TODO
 * Time O(?), Space O(?).
 */
public class P0134_GasStation {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        // TODO
        return 0;
    }

    public static void main(String[] args) {
        P0134_GasStation sol = new P0134_GasStation();
        check(sol.canCompleteCircuit(new int[]{1, 2, 3, 4, 5}, new int[]{3, 4, 5, 1, 2}), 3);
        check(sol.canCompleteCircuit(new int[]{2, 3, 4}, new int[]{3, 4, 3}), -1);
    }
}
