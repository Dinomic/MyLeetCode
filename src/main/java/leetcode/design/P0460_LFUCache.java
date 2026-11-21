package leetcode.design;

import static leetcode.common.Check.*;

/**
 * 460. LFU Cache (Hard) - https://leetcode.com/problems/lfu-cache/
 * <p>
 * Idea: TODO
 * Time O(?), Space O(?).
 */
public class P0460_LFUCache {
    public P0460_LFUCache(int capacity) {
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
        P0460_LFUCache cache = new P0460_LFUCache(2);
        cache.put(1, 1);
        cache.put(2, 2);
        check(cache.get(1), 1);
        cache.put(3, 3); // evicts key 2
        check(cache.get(2), -1);
        check(cache.get(3), 3);
        cache.put(4, 4); // evicts key 1 (tie on frequency, least recently used)
        check(cache.get(1), -1);
        check(cache.get(3), 3);
        check(cache.get(4), 4);
    }
}
