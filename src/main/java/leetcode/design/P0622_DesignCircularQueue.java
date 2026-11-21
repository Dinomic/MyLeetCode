package leetcode.design;

import static leetcode.common.Check.*;

/**
 * 622. Design Circular Queue (Medium) - https://leetcode.com/problems/design-circular-queue/
 * <p>
 * Idea: TODO
 * Time O(?), Space O(?).
 */
public class P0622_DesignCircularQueue {
    public P0622_DesignCircularQueue(int k) {
        // TODO
    }

    public boolean enQueue(int value) {
        // TODO
        return false;
    }

    public boolean deQueue() {
        // TODO
        return false;
    }

    public int Front() {
        // TODO
        return 0;
    }

    public int Rear() {
        // TODO
        return 0;
    }

    public boolean isEmpty() {
        // TODO
        return false;
    }

    public boolean isFull() {
        // TODO
        return false;
    }

    public static void main(String[] args) {
        P0622_DesignCircularQueue q = new P0622_DesignCircularQueue(3);
        check(q.enQueue(1), true);
        check(q.enQueue(2), true);
        check(q.enQueue(3), true);
        check(q.enQueue(4), false);
        check(q.Rear(), 3);
        check(q.isFull(), true);
        check(q.deQueue(), true);
        check(q.enQueue(4), true);
        check(q.Rear(), 4);
        check(q.Front(), 2);
    }
}
