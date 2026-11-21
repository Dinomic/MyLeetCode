package leetcode.math;

import static leetcode.common.Check.*;

/**
 * 43. Multiply Strings (Medium) - https://leetcode.com/problems/multiply-strings/
 * <p>
 * Idea: TODO
 * Time O(?), Space O(?).
 */
public class P0043_MultiplyStrings {
    public String multiply(String num1, String num2) {
        // TODO
        return null;
    }

    public static void main(String[] args) {
        P0043_MultiplyStrings sol = new P0043_MultiplyStrings();
        check(sol.multiply("2", "3"), "6");
        check(sol.multiply("123", "456"), "56088");
        check(sol.multiply("0", "12"), "0");
    }
}
