package leetcode.heap;

import static leetcode.common.Check.*;

/**
 * 215. Kth Largest Element in an Array (Medium) - https://leetcode.com/problems/kth-largest-element-in-an-array/
 * <p>
 * Idea: TODO
 * Time O(?), Space O(?).
 */
public class P0215_KthLargestElementInAnArray {
    public int findKthLargest(int[] nums, int k) {
        // TODO
        return 0;
    }

    public static void main(String[] args) {
        P0215_KthLargestElementInAnArray sol = new P0215_KthLargestElementInAnArray();
        check(sol.findKthLargest(new int[]{3, 2, 1, 5, 6, 4}, 2), 5);
        check(sol.findKthLargest(new int[]{3, 2, 3, 1, 2, 4, 5, 5, 6}, 4), 4);
    }
}
