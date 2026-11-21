package leetcode.bitmanipulation;

import static leetcode.common.Check.*;

/**
 * 190. Reverse Bits (Easy) - https://leetcode.com/problems/reverse-bits/
 * <p>
 * Idea: TODO
 * Time O(?), Space O(?).
 */
public class P0190_ReverseBits {
    public int reverseBits(int n) {
        // TODO
        return 0;
    }

    public static void main(String[] args) {
        P0190_ReverseBits sol = new P0190_ReverseBits();
        check(sol.reverseBits(43261596), 964176192);
        check(sol.reverseBits(-3), -1073741825); // 4294967293 as an unsigned 32-bit value
    }
}
