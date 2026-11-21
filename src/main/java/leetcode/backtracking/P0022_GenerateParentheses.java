package leetcode.backtracking;

import java.util.*;
import static leetcode.common.Check.*;

/**
 * 22. Generate Parentheses (Medium) - https://leetcode.com/problems/generate-parentheses/
 * <p>
 * Idea: TODO
 * Time O(?), Space O(?).
 */
public class P0022_GenerateParentheses {
    public List<String> generateParenthesis(int n) {
        // TODO
        return null;
    }

    public static void main(String[] args) {
        P0022_GenerateParentheses sol = new P0022_GenerateParentheses();
        checkAnyOrder(sol.generateParenthesis(3), List.of("((()))", "(()())", "(())()", "()(())", "()()()"));
        checkAnyOrder(sol.generateParenthesis(1), List.of("()"));
    }
}
