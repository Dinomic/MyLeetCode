package leetcode.design;

import static leetcode.common.Check.*;

/**
 * 146. LRU Cache (Medium) - https://leetcode.com/problems/lru-cache/
 * <p>
 * Idea: TODO
 * Time O(?), Space O(?).
 */
public class P0146_LRUCache {
    public P0146_LRUCache(int capacity) {
        // TODO
    }

    public int get(int key) {
        // TODO
        return 0;
    }

    public void put(int key, int value) {
        // TODO
    }

    public static void main(String[] args) {
        P0146_LRUCache cache = new P0146_LRUCache(2);
        cache.put(1, 1);
        cache.put(2, 2);
        check(cache.get(1), 1);
        cache.put(3, 3); // evicts key 2
        check(cache.get(2), -1);
        cache.put(4, 4); // evicts key 1
        check(cache.get(1), -1);
        check(cache.get(3), 3);
        check(cache.get(4), 4);
    }
}
