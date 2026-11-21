package leetcode.trie;

import static leetcode.common.Check.*;

/**
 * 421. Maximum XOR of Two Numbers in an Array (Medium) - https://leetcode.com/problems/maximum-xor-of-two-numbers-in-an-array/
 * <p>
 * Idea: TODO
 * Time O(?), Space O(?).
 */
public class P0421_MaximumXOROfTwoNumbersInAnArray {
    public int findMaximumXOR(int[] nums) {
        // TODO
        return 0;
    }

    public static void main(String[] args) {
        P0421_MaximumXOROfTwoNumbersInAnArray sol = new P0421_MaximumXOROfTwoNumbersInAnArray();
        check(sol.findMaximumXOR(new int[]{3, 10, 5, 25, 2, 8}), 28);
        check(sol.findMaximumXOR(new int[]{14, 70, 53, 83, 49, 91, 36, 80, 92, 51, 66, 70}), 127);
        check(sol.findMaximumXOR(new int[]{0}), 0);
    }
}
