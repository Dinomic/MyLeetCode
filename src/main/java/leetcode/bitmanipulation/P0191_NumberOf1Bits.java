package leetcode.bitmanipulation;

import static leetcode.common.Check.*;

/**
 * 191. Number of 1 Bits (Easy) - https://leetcode.com/problems/number-of-1-bits/
 * <p>
 * Idea: TODO
 * Time O(?), Space O(?).
 */
public class P0191_NumberOf1Bits {
    public int hammingWeight(int n) {
        // TODO
        return 0;
    }

    public static void main(String[] args) {
        P0191_NumberOf1Bits sol = new P0191_NumberOf1Bits();
        check(sol.hammingWeight(11), 3);
        check(sol.hammingWeight(128), 1);
        check(sol.hammingWeight(2147483645), 30);
    }
}
