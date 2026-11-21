package leetcode.backtracking;

import java.util.*;
import static leetcode.common.Check.*;

/**
 * 131. Palindrome Partitioning (Medium) - https://leetcode.com/problems/palindrome-partitioning/
 * <p>
 * Idea: TODO
 * Time O(?), Space O(?).
 */
public class P0131_PalindromePartitioning {
    public List<List<String>> partition(String s) {
        // TODO
        return null;
    }

    public static void main(String[] args) {
        P0131_PalindromePartitioning sol = new P0131_PalindromePartitioning();
        checkAnyOrder(sol.partition("aab"), List.of(List.of("a", "a", "b"), List.of("aa", "b")));
        checkAnyOrder(sol.partition("a"), List.of(List.of("a")));
    }
}
