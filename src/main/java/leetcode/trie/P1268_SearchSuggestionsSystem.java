package leetcode.trie;

import java.util.*;
import static leetcode.common.Check.*;

/**
 * 1268. Search Suggestions System (Medium) - https://leetcode.com/problems/search-suggestions-system/
 * <p>
 * Idea: TODO
 * Time O(?), Space O(?).
 */
public class P1268_SearchSuggestionsSystem {
    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        // TODO
        return null;
    }

    public static void main(String[] args) {
        P1268_SearchSuggestionsSystem sol = new P1268_SearchSuggestionsSystem();
        check(sol.suggestedProducts(new String[]{"mobile", "mouse", "moneypot", "monitor", "mousepad"}, "mouse"),
                List.of(List.of("mobile", "moneypot", "monitor"),
                        List.of("mobile", "moneypot", "monitor"),
                        List.of("mouse", "mousepad"),
                        List.of("mouse", "mousepad"),
                        List.of("mouse", "mousepad")));
        check(sol.suggestedProducts(new String[]{"havana"}, "havana"),
                List.of(List.of("havana"), List.of("havana"), List.of("havana"), List.of("havana"), List.of("havana"), List.of("havana")));
        check(sol.suggestedProducts(new String[]{"havana"}, "tatiana"),
                List.of(List.of(), List.of(), List.of(), List.of(), List.of(), List.of(), List.of()));
    }
}
