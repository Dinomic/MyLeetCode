package leetcode.dp;

import java.util.*;
import static leetcode.common.Check.*;

/**
 * 139. Word Break (Medium) - https://leetcode.com/problems/word-break/
 * <p>
 * Idea: TODO
 * Time O(?), Space O(?).
 */
public class P0139_WordBreak {
    public boolean wordBreak(String s, List<String> wordDict) {
        // TODO
        return false;
    }

    public static void main(String[] args) {
        P0139_WordBreak sol = new P0139_WordBreak();
        check(sol.wordBreak("leetcode", List.of("leet", "code")), true);
        check(sol.wordBreak("applepenapple", List.of("apple", "pen")), true);
        check(sol.wordBreak("catsandog", List.of("cats", "dog", "sand", "and", "cat")), false);
    }
}
