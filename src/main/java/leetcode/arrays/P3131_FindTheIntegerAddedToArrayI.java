package leetcode.arrays;

import java.util.Arrays;

/**
 * 3131. Find the Integer Added to Array I (Easy) - https://leetcode.com/problems/find-the-integer-added-to-array-i/
 * <p>
 * Idea: every element shifts by the same x, so the minimums differ by x.
 * Time O(n), Space O(1).
 */
public class P3131_FindTheIntegerAddedToArrayI {
    public int addedInteger(int[] nums1, int[] nums2) {
        int min1 = Arrays.stream(nums1).min().getAsInt();
        int min2 = Arrays.stream(nums2).min().getAsInt();
        return min2 - min1;
    }

    public static void main(String[] args) {
        P3131_FindTheIntegerAddedToArrayI sol = new P3131_FindTheIntegerAddedToArrayI();
        System.out.println(sol.addedInteger(new int[]{2, 6, 4}, new int[]{9, 7, 5}));
        System.out.println(sol.addedInteger(new int[]{10}, new int[]{5}));
        System.out.println(sol.addedInteger(new int[]{1, 1, 1, 1}, new int[]{1, 1, 1, 1}));
    }
}
