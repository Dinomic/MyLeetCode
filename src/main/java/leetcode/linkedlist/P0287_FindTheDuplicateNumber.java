package leetcode.linkedlist;

import static leetcode.common.Check.*;

/**
 * 287. Find the Duplicate Number (Medium) - https://leetcode.com/problems/find-the-duplicate-number/
 * <p>
 * Idea: TODO
 * Time O(?), Space O(?).
 */
public class P0287_FindTheDuplicateNumber {
    public int findDuplicate(int[] nums) {
        // TODO
        return 0;
    }

    public static void main(String[] args) {
        P0287_FindTheDuplicateNumber sol = new P0287_FindTheDuplicateNumber();
        check(sol.findDuplicate(new int[]{1, 3, 4, 2, 2}), 2);
        check(sol.findDuplicate(new int[]{3, 1, 3, 4, 2}), 3);
        check(sol.findDuplicate(new int[]{3, 3, 3, 3, 3}), 3);
    }
}
