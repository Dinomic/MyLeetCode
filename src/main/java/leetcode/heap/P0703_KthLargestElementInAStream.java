package leetcode.heap;

import static leetcode.common.Check.*;

/**
 * 703. Kth Largest Element in a Stream (Easy) - https://leetcode.com/problems/kth-largest-element-in-a-stream/
 * <p>
 * Idea: TODO
 * Time O(?), Space O(?).
 */
public class P0703_KthLargestElementInAStream {
    public P0703_KthLargestElementInAStream(int k, int[] nums) {
        // TODO
    }

    public int add(int val) {
        // TODO
        return 0;
    }

    public static void main(String[] args) {
        P0703_KthLargestElementInAStream kthLargest = new P0703_KthLargestElementInAStream(3, new int[]{4, 5, 8, 2});
        check(kthLargest.add(3), 4);
        check(kthLargest.add(5), 5);
        check(kthLargest.add(10), 5);
        check(kthLargest.add(9), 8);
        check(kthLargest.add(4), 8);
    }
}
