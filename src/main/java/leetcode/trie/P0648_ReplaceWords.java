package leetcode.trie;

import java.util.*;
import static leetcode.common.Check.*;

/**
 * 648. Replace Words (Medium) - https://leetcode.com/problems/replace-words/
 * <p>
 * Idea: TODO
 * Time O(?), Space O(?).
 */
public class P0648_ReplaceWords {
    public String replaceWords(List<String> dictionary, String sentence) {
        // TODO
        return null;
    }

    public static void main(String[] args) {
        P0648_ReplaceWords sol = new P0648_ReplaceWords();
        check(sol.replaceWords(List.of("cat", "bat", "rat"), "the cattle was rattled by the battery"), "the cat was rat by the bat");
        check(sol.replaceWords(List.of("a", "b", "c"), "aadsfasf absbs bbab cadsfafs"), "a a b c");
    }
}
