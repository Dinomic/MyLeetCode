package leetcode.stack;

import static leetcode.common.Check.*;

/**
 * 155. Min Stack (Medium) - https://leetcode.com/problems/min-stack/
 * <p>
 * Idea: TODO
 * Time O(?), Space O(?).
 */
public class P0155_MinStack {
    public P0155_MinStack() {
    }

    public void push(int val) {
        // TODO
    }

    public void pop() {
        // TODO
    }

    public int top() {
        // TODO
        return 0;
    }

    public int getMin() {
        // TODO
        return 0;
    }

    public static void main(String[] args) {
        P0155_MinStack s = new P0155_MinStack();
        s.push(-2);
        s.push(0);
        s.push(-3);
        check(s.getMin(), -3);
        s.pop();
        check(s.top(), 0);
        check(s.getMin(), -2);
    }
}
