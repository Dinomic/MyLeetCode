package leetcode.binarysearch;

import static leetcode.common.Check.*;

/**
 * 153. Find Minimum in Rotated Sorted Array (Medium) - https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/
 * <p>
 * Idea: TODO
 * Time O(?), Space O(?).
 */
public class P0153_FindMinimumInRotatedSortedArray {
    public int findMin(int[] nums) {
        // TODO
        return 0;
    }

    public static void main(String[] args) {
        P0153_FindMinimumInRotatedSortedArray sol = new P0153_FindMinimumInRotatedSortedArray();
        check(sol.findMin(new int[]{3, 4, 5, 1, 2}), 1);
        check(sol.findMin(new int[]{4, 5, 6, 7, 0, 1, 2}), 0);
        check(sol.findMin(new int[]{11, 13, 15, 17}), 11);
    }
}
