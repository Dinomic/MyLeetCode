package leetcode.strings;

import java.util.HashMap;
import java.util.Map;

import static leetcode.common.Check.*;

/**
 * 205. Isomorphic Strings (Easy) - https://leetcode.com/problems/isomorphic-strings/
 * <p>
 * Idea: TODO
 * Time O(?), Space O(?).
 */
public class P0205_IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;
        Map<Character, Character> dicst = new HashMap<>();
        Map<Character, Character> dicts = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            Character ttt = dicst.get(s.charAt(i));
            Character sss = dicts.get(t.charAt(i));
            if (ttt == null && sss == null) {
                dicst.put(s.charAt(i), t.charAt(i));
                dicts.put(t.charAt(i), s.charAt(i));
                continue;
            }
            if (ttt != null && sss != null && ttt == t.charAt(i) && sss == s.charAt(i)) {
                continue;
            }
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        P0205_IsomorphicStrings sol = new P0205_IsomorphicStrings();
        check(sol.isIsomorphic("egg", "add"), true);
        check(sol.isIsomorphic("foo", "bar"), false);
        check(sol.isIsomorphic("paper", "title"), true);
        check(sol.isIsomorphic("badc", "baba"), false);
    }
}
