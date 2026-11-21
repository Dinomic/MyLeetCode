package leetcode.backtracking;

import java.util.*;
import static leetcode.common.Check.*;

/**
 * 17. Letter Combinations of a Phone Number (Medium) - https://leetcode.com/problems/letter-combinations-of-a-phone-number/
 * <p>
 * Idea: TODO
 * Time O(?), Space O(?).
 */
public class P0017_LetterCombinationsOfAPhoneNumber {
    public List<String> letterCombinations(String digits) {
        // TODO
        return null;
    }

    public static void main(String[] args) {
        P0017_LetterCombinationsOfAPhoneNumber sol = new P0017_LetterCombinationsOfAPhoneNumber();
        checkAnyOrder(sol.letterCombinations("23"), List.of("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"));
        checkAnyOrder(sol.letterCombinations(""), List.of());
        checkAnyOrder(sol.letterCombinations("2"), List.of("a", "b", "c"));
    }
}
