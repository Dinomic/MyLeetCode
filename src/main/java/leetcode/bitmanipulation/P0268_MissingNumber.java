package leetcode.bitmanipulation;

import static leetcode.common.Check.*;

/**
 * 268. Missing Number (Easy) - https://leetcode.com/problems/missing-number/
 * <p>
 * Idea: TODO
 * Time O(?), Space O(?).
 */
public class P0268_MissingNumber {
    public int missingNumber(int[] nums) {
        // TODO
        return 0;
    }

    public static void main(String[] args) {
        P0268_MissingNumber sol = new P0268_MissingNumber();
        check(sol.missingNumber(new int[]{3, 0, 1}), 2);
        check(sol.missingNumber(new int[]{0, 1}), 2);
        check(sol.missingNumber(new int[]{9, 6, 4, 2, 3, 5, 7, 0, 1}), 8);
    }
}
