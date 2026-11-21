package leetcode.binarysearch;

import static leetcode.common.Check.*;

/**
 * 4. Median of Two Sorted Arrays (Hard) - https://leetcode.com/problems/median-of-two-sorted-arrays/
 * <p>
 * Idea: TODO
 * Time O(?), Space O(?).
 */
public class P0004_MedianOfTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // TODO
        return 0;
    }

    public static void main(String[] args) {
        P0004_MedianOfTwoSortedArrays sol = new P0004_MedianOfTwoSortedArrays();
        checkApprox(sol.findMedianSortedArrays(new int[]{1, 3}, new int[]{2}), 2.0);
        checkApprox(sol.findMedianSortedArrays(new int[]{1, 2}, new int[]{3, 4}), 2.5);
        checkApprox(sol.findMedianSortedArrays(new int[]{}, new int[]{1}), 1.0);
    }
}
