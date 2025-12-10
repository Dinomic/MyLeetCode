package solutions;

import java.util.*;

public class Solution49GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            char[] arr = str.toCharArray();
            Arrays.sort(arr);
            if (map.containsKey(String.valueOf(arr))) {
                map.get(String.valueOf(arr)).add(str);
            } else  {
                List<String> list = new ArrayList<>();
                list.add(str);
                map.put(String.valueOf(arr), list);
            }
        }
        return new ArrayList<>(map.values());
    }
}
