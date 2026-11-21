package leetcode.dp;

import static leetcode.common.Check.*;

/**
 * 509. Fibonacci Number (Easy) - https://leetcode.com/problems/fibonacci-number/
 * <p>
 * Idea: TODO
 * Time O(?), Space O(?).
 */
public class P0509_FibonacciNumber {
    public int fib(int n) {
        // TODO
        return 0;
    }

    public static void main(String[] args) {
        P0509_FibonacciNumber sol = new P0509_FibonacciNumber();
        check(sol.fib(2), 1);
        check(sol.fib(3), 2);
        check(sol.fib(4), 3);
        check(sol.fib(30), 832040);
    }
}
