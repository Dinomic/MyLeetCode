package leetcode.strings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 242. Valid Anagram (Easy) - https://leetcode.com/problems/valid-anagram/
 * <p>
 * Idea: two strings are anagrams iff their sorted characters are equal.
 * Time O(n log n), Space O(n). (Counting characters in a map/array gets O(n) time.)
 */
public class P0242_ValidAnagram {
//    public boolean isAnagram(String s, String t) {
//        if (s == null || t == null || s.length() != t.length()) return false;
//
//        char[] a = s.toCharArray();
//        char[] b = t.toCharArray();
//        Arrays.sort(a);
//        Arrays.sort(b);
//        return Arrays.equals(a, b);
//    }

    public boolean isAnagram(String s, String t) {
        if (s == null || t == null || s.length() != t.length()) return false;
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (!map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), 1);
            } else {
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
            }
        }
        for (int i = 0; i < t.length(); i++) {
            if (!map.containsKey(t.charAt(i))) {
                return false;
            }
            map.put(t.charAt(i), map.get(t.charAt(i)) - 1);
            if (map.get(t.charAt(i)) < 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        P0242_ValidAnagram sol = new P0242_ValidAnagram();
        System.out.println(sol.isAnagram("anagram", "nagaram"));
        System.out.println(sol.isAnagram("rat", "car"));
        System.out.println(sol.isAnagram("a", "ab"));
    }
}
