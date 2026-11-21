package leetcode.math;

import static leetcode.common.Check.*;

/**
 * 50. Pow(x, n) (Medium) - https://leetcode.com/problems/powx-n/
 * <p>
 * Idea: TODO
 * Time O(?), Space O(?).
 */
public class P0050_PowXN {
    public double myPow(double x, int n) {
        // TODO
        return 0;
    }

    public static void main(String[] args) {
        P0050_PowXN sol = new P0050_PowXN();
        checkApprox(sol.myPow(2.0, 10), 1024.0);
        checkApprox(sol.myPow(2.1, 3), 9.261);
        checkApprox(sol.myPow(2.0, -2), 0.25);
    }
}
