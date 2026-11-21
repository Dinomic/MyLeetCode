package leetcode.design;

import static leetcode.common.Check.*;

/**
 * 380. Insert Delete GetRandom O(1) (Medium) - https://leetcode.com/problems/insert-delete-getrandom-o1/
 * <p>
 * Idea: TODO
 * Time O(?), Space O(?).
 */
public class P0380_InsertDeleteGetRandomO1 {
    public P0380_InsertDeleteGetRandomO1() {
    }

    public boolean insert(int val) {
        // TODO
        return false;
    }

    public boolean remove(int val) {
        // TODO
        return false;
    }

    public int getRandom() {
        // TODO
        return 0;
    }

    public static void main(String[] args) {
        P0380_InsertDeleteGetRandomO1 set = new P0380_InsertDeleteGetRandomO1();
        check(set.insert(1), true);
        check(set.remove(2), false);
        check(set.insert(2), true);
        int r = set.getRandom();
        check(r == 1 || r == 2, true);
        check(set.remove(1), true);
        check(set.insert(2), false);
        check(set.getRandom(), 2);
    }
}
