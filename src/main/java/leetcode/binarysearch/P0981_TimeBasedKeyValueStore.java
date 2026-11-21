package leetcode.binarysearch;

import static leetcode.common.Check.*;

/**
 * 981. Time Based Key-Value Store (Medium) - https://leetcode.com/problems/time-based-key-value-store/
 * <p>
 * Idea: TODO
 * Time O(?), Space O(?).
 */
public class P0981_TimeBasedKeyValueStore {
    public P0981_TimeBasedKeyValueStore() {
    }

    public void set(String key, String value, int timestamp) {
        // TODO
    }

    public String get(String key, int timestamp) {
        // TODO
        return null;
    }

    public static void main(String[] args) {
        P0981_TimeBasedKeyValueStore map = new P0981_TimeBasedKeyValueStore();
        map.set("foo", "bar", 1);
        check(map.get("foo", 1), "bar");
        check(map.get("foo", 3), "bar");
        map.set("foo", "bar2", 4);
        check(map.get("foo", 4), "bar2");
        check(map.get("foo", 5), "bar2");
        check(map.get("foo", 0), "");
    }
}
