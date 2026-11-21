package leetcode.graph;

import java.util.*;
import static leetcode.common.Check.*;

/**
 * 332. Reconstruct Itinerary (Hard) - https://leetcode.com/problems/reconstruct-itinerary/
 * <p>
 * Idea: TODO
 * Time O(?), Space O(?).
 */
public class P0332_ReconstructItinerary {
    public List<String> findItinerary(List<List<String>> tickets) {
        // TODO
        return null;
    }

    public static void main(String[] args) {
        P0332_ReconstructItinerary sol = new P0332_ReconstructItinerary();
        check(sol.findItinerary(List.of(List.of("MUC", "LHR"), List.of("JFK", "MUC"), List.of("SFO", "SJC"), List.of("LHR", "SFO"))),
                List.of("JFK", "MUC", "LHR", "SFO", "SJC"));
        check(sol.findItinerary(List.of(List.of("JFK", "SFO"), List.of("JFK", "ATL"), List.of("SFO", "ATL"), List.of("ATL", "JFK"), List.of("ATL", "SFO"))),
                List.of("JFK", "ATL", "JFK", "SFO", "ATL", "SFO"));
    }
}
