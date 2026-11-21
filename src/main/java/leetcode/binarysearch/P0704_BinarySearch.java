package leetcode.binarysearch;

import static leetcode.common.Check.*;

/**
 * 704. Binary Search (Easy) - https://leetcode.com/problems/binary-search/
 * <p>
 * Idea: TODO
 * Time O(?), Space O(?).
 */
public class P0704_BinarySearch {
    public int search(int[] nums, int target) {
        // TODO
        return 0;
    }

    public static void main(String[] args) {
        P0704_BinarySearch sol = new P0704_BinarySearch();
        check(sol.search(new int[]{-1, 0, 3, 5, 9, 12}, 9), 4);
        check(sol.search(new int[]{-1, 0, 3, 5, 9, 12}, 2), -1);
    }
}
