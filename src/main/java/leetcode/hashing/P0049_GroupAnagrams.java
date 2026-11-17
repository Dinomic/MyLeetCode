package leetcode.hashing;

import java.util.*;

/**
 * 49. Group Anagrams (Medium) - https://leetcode.com/problems/group-anagrams/
 * <p>
 * Idea: anagrams share the same sorted-characters key; group by that key.
 * Time O(n * k log k), Space O(n * k), k = max string length.
 */
public class P0049_GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> groups = new HashMap<>();
        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            groups.computeIfAbsent(new String(chars), k -> new ArrayList<>()).add(str);
        }
        return new ArrayList<>(groups.values());
    }

    public static void main(String[] args) {
        P0049_GroupAnagrams sol = new P0049_GroupAnagrams();
        System.out.println(sol.groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}));
        System.out.println(sol.groupAnagrams(new String[]{""}));
    }
}
