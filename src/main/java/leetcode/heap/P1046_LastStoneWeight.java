package leetcode.heap;

import static leetcode.common.Check.*;

/**
 * 1046. Last Stone Weight (Easy) - https://leetcode.com/problems/last-stone-weight/
 * <p>
 * Idea: TODO
 * Time O(?), Space O(?).
 */
public class P1046_LastStoneWeight {
    public int lastStoneWeight(int[] stones) {
        // TODO
        return 0;
    }

    public static void main(String[] args) {
        P1046_LastStoneWeight sol = new P1046_LastStoneWeight();
        check(sol.lastStoneWeight(new int[]{2, 7, 4, 1, 8, 1}), 1);
        check(sol.lastStoneWeight(new int[]{1}), 1);
    }
}
