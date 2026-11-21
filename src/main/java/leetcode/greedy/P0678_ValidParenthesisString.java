package leetcode.greedy;

import static leetcode.common.Check.*;

/**
 * 678. Valid Parenthesis String (Medium) - https://leetcode.com/problems/valid-parenthesis-string/
 * <p>
 * Idea: TODO
 * Time O(?), Space O(?).
 */
public class P0678_ValidParenthesisString {
    public boolean checkValidString(String s) {
        // TODO
        return false;
    }

    public static void main(String[] args) {
        P0678_ValidParenthesisString sol = new P0678_ValidParenthesisString();
        check(sol.checkValidString("()"), true);
        check(sol.checkValidString("(*)"), true);
        check(sol.checkValidString("(*))"), true);
        check(sol.checkValidString("(("), false);
        check(sol.checkValidString(")*("), false);
    }
}
