package leetcode.graph;

import static leetcode.common.Check.*;

/**
 * 787. Cheapest Flights Within K Stops (Medium) - https://leetcode.com/problems/cheapest-flights-within-k-stops/
 * <p>
 * Idea: TODO
 * Time O(?), Space O(?).
 */
public class P0787_CheapestFlightsWithinKStops {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        // TODO
        return 0;
    }

    public static void main(String[] args) {
        P0787_CheapestFlightsWithinKStops sol = new P0787_CheapestFlightsWithinKStops();
        check(sol.findCheapestPrice(4, new int[][]{{0, 1, 100}, {1, 2, 100}, {2, 0, 100}, {1, 3, 600}, {2, 3, 200}}, 0, 3, 1), 700);
        check(sol.findCheapestPrice(3, new int[][]{{0, 1, 100}, {1, 2, 100}, {0, 2, 500}}, 0, 2, 1), 200);
        check(sol.findCheapestPrice(3, new int[][]{{0, 1, 100}, {1, 2, 100}, {0, 2, 500}}, 0, 2, 0), 500);
    }
}
