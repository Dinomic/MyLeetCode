package leetcode.graph;

import static leetcode.common.Check.*;

/**
 * 743. Network Delay Time (Medium) - https://leetcode.com/problems/network-delay-time/
 * <p>
 * Idea: TODO
 * Time O(?), Space O(?).
 */
public class P0743_NetworkDelayTime {
    public int networkDelayTime(int[][] times, int n, int k) {
        // TODO
        return 0;
    }

    public static void main(String[] args) {
        P0743_NetworkDelayTime sol = new P0743_NetworkDelayTime();
        check(sol.networkDelayTime(new int[][]{{2, 1, 1}, {2, 3, 1}, {3, 4, 1}}, 4, 2), 2);
        check(sol.networkDelayTime(new int[][]{{1, 2, 1}}, 2, 1), 1);
        check(sol.networkDelayTime(new int[][]{{1, 2, 1}}, 2, 2), -1);
    }
}
