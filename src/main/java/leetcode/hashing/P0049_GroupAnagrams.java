package leetcode.hashing;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 49. Group Anagrams (Medium) - https://leetcode.com/problems/group-anagrams/
 * <p>
 * Idea: anagrams share the same sorted-characters key; group by that key.
 * Time O(n * k log k), Space O(n * k), k = max string length.
 */
public class P0049_GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> result = new HashMap<>();
        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);
            if (result.containsKey(sorted)) {
                result.put(sorted, Stream.concat(result.get(sorted).stream(), Stream.of(str))
                    .collect(Collectors.toList()));
            } else {
                result.put(sorted, List.of(str));
            }
        }
        return result.values().stream().map(List::copyOf).toList();
    }

    public static void main(String[] args) {
        P0049_GroupAnagrams sol = new P0049_GroupAnagrams();
        System.out.println(sol.groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}));
        System.out.println(sol.groupAnagrams(new String[]{""}));
    }
}
