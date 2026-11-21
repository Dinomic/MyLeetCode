package leetcode.binarysearch;

import static leetcode.common.Check.*;

/**
 * 33. Search in Rotated Sorted Array (Medium) - https://leetcode.com/problems/search-in-rotated-sorted-array/
 * <p>
 * Idea: TODO
 * Time O(?), Space O(?).
 */
public class P0033_SearchInRotatedSortedArray {
    public int search(int[] nums, int target) {
        // TODO
        return 0;
    }

    public static void main(String[] args) {
        P0033_SearchInRotatedSortedArray sol = new P0033_SearchInRotatedSortedArray();
        check(sol.search(new int[]{4, 5, 6, 7, 0, 1, 2}, 0), 4);
        check(sol.search(new int[]{4, 5, 6, 7, 0, 1, 2}, 3), -1);
        check(sol.search(new int[]{1}, 0), -1);
    }
}
