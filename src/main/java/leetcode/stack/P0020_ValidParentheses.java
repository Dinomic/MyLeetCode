package leetcode.stack;

import static leetcode.common.Check.*;

/**
 * 20. Valid Parentheses (Easy) - https://leetcode.com/problems/valid-parentheses/
 * <p>
 * Idea: TODO
 * Time O(?), Space O(?).
 */
public class P0020_ValidParentheses {
    public boolean isValid(String s) {
        // TODO
        return false;
    }

    public static void main(String[] args) {
        P0020_ValidParentheses sol = new P0020_ValidParentheses();
        check(sol.isValid("()"), true);
        check(sol.isValid("()[]{}"), true);
        check(sol.isValid("(]"), false);
        check(sol.isValid("([)]"), false);
        check(sol.isValid("{[]}"), true);
    }
}
