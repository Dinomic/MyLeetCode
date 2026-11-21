package leetcode.heap;

import static leetcode.common.Check.*;

/**
 * 295. Find Median from Data Stream (Hard) - https://leetcode.com/problems/find-median-from-data-stream/
 * <p>
 * Idea: TODO
 * Time O(?), Space O(?).
 */
public class P0295_FindMedianFromDataStream {
    public P0295_FindMedianFromDataStream() {
    }

    public void addNum(int num) {
        // TODO
    }

    public double findMedian() {
        // TODO
        return 0;
    }

    public static void main(String[] args) {
        P0295_FindMedianFromDataStream medianFinder = new P0295_FindMedianFromDataStream();
        medianFinder.addNum(1);
        medianFinder.addNum(2);
        checkApprox(medianFinder.findMedian(), 1.5);
        medianFinder.addNum(3);
        checkApprox(medianFinder.findMedian(), 2.0);
    }
}
