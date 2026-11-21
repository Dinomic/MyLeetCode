package leetcode.trie;

import static leetcode.common.Check.*;

/**
 * 677. Map Sum Pairs (Medium) - https://leetcode.com/problems/map-sum-pairs/
 * <p>
 * Idea: TODO
 * Time O(?), Space O(?).
 */
public class P0677_MapSumPairs {
    public P0677_MapSumPairs() {
    }

    public void insert(String key, int val) {
        // TODO
    }

    public int sum(String prefix) {
        // TODO
        return 0;
    }

    public static void main(String[] args) {
        P0677_MapSumPairs mapSum = new P0677_MapSumPairs();
        mapSum.insert("apple", 3);
        check(mapSum.sum("ap"), 3);
        mapSum.insert("app", 2);
        check(mapSum.sum("ap"), 5);
        mapSum.insert("apple", 2); // overrides the old value
        check(mapSum.sum("ap"), 4);
    }
}
