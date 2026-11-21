package leetcode.bitmanipulation;

import static leetcode.common.Check.*;

/**
 * 136. Single Number (Easy) - https://leetcode.com/problems/single-number/
 * <p>
 * Idea: TODO
 * Time O(?), Space O(?).
 */
public class P0136_SingleNumber {
    public int singleNumber(int[] nums) {
        // TODO
        return 0;
    }

    public static void main(String[] args) {
        P0136_SingleNumber sol = new P0136_SingleNumber();
        check(sol.singleNumber(new int[]{2, 2, 1}), 1);
        check(sol.singleNumber(new int[]{4, 1, 2, 1, 2}), 4);
        check(sol.singleNumber(new int[]{1}), 1);
    }
}
