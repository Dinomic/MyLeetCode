package solutions;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Solution347TopKFrequentElements {
    public int[] topKFrequent(int[] nums, int k) {
        List<Integer> result = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
//        Map<Integer, List<Integer>> map2 = new HashMap<>();
//        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
//            if  (map2.containsKey(entry.getValue())) {
//                map2.put(entry.getValue(), Stream.concat(map2.get(entry.getValue()).stream(), Stream.of(entry.getKey())).collect(Collectors.toList()));
//            } else {
//                map2.put(entry.getValue(), List.of(entry.getKey()));
//            }
//        }
//        List<Integer> sortedKeys = new ArrayList<>(map2.keySet()).stream().sorted((a, b) -> b - a).toList();
//        int si = 0;
//        while (k > 0) {
//            int temp = Math.min(k, map2.get(sortedKeys.get(si)).size());
//            result.addAll(map2.get(sortedKeys.get(si)).subList(0, temp));
//            k -= temp;
//            si++;
//        }
//        return result.stream()
//                .mapToInt(Integer::intValue)
//                .toArray();




        List<List<Integer>> list = new ArrayList<>(Collections.nCopies(nums.length + 1, null));
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            List<Integer> bucket = list.get(entry.getValue());
            if (bucket == null) {
                bucket = new ArrayList<>();
                list.set(entry.getValue(), bucket);
            }
            bucket.add(entry.getKey());
        }
        for (int i = nums.length; 0 < k; i--) {
            if (list.get(i) != null && list.get(i).size() != 0) {
                int min = Math.min(k, list.get(i).size());
                result.addAll(list.get(i).subList(0, min));
                k -= min;
            }
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
