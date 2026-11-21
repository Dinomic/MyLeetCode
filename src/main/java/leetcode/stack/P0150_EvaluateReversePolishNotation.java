package leetcode.stack;

import static leetcode.common.Check.*;

/**
 * 150. Evaluate Reverse Polish Notation (Medium) - https://leetcode.com/problems/evaluate-reverse-polish-notation/
 * <p>
 * Idea: TODO
 * Time O(?), Space O(?).
 */
public class P0150_EvaluateReversePolishNotation {
    public int evalRPN(String[] tokens) {
        // TODO
        return 0;
    }

    public static void main(String[] args) {
        P0150_EvaluateReversePolishNotation sol = new P0150_EvaluateReversePolishNotation();
        check(sol.evalRPN(new String[]{"2", "1", "+", "3", "*"}), 9);
        check(sol.evalRPN(new String[]{"4", "13", "5", "/", "+"}), 6);
        check(sol.evalRPN(new String[]{"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"}), 22);
    }
}
