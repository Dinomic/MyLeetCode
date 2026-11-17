package leetcode.strings;

import java.util.Arrays;

/**
 * 242. Valid Anagram (Easy) - https://leetcode.com/problems/valid-anagram/
 * <p>
 * Idea: two strings are anagrams iff their sorted characters are equal.
 * Time O(n log n), Space O(n). (Counting characters in a map/array gets O(n) time.)
 */
public class P0242_ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if (s == null || t == null || s.length() != t.length()) return false;

        char[] a = s.toCharArray();
        char[] b = t.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        return Arrays.equals(a, b);
    }

    public static void main(String[] args) {
        P0242_ValidAnagram sol = new P0242_ValidAnagram();
        System.out.println(sol.isAnagram("anagram", "nagaram"));
        System.out.println(sol.isAnagram("rat", "car"));
        System.out.println(sol.isAnagram("a", "ab"));
    }
}
