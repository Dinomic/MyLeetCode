package leetcode.hashing;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 347. Top K Frequent Elements (Medium) - https://leetcode.com/problems/top-k-frequent-elements/
 * <p>
 * Idea: count frequencies, then bucket numbers by frequency (a frequency is at most nums.length)
 * and read buckets from the highest frequency down until k numbers are collected.
 * Time O(n), Space O(n).
 */
public class P0347_TopKFrequentElements {
//    public int[] topKFrequent(int[] nums, int k) {
//        List<Integer> result = new ArrayList<>();
//        Map<Integer, Integer> map = new HashMap<>();
//        for (int num : nums) {
//            map.put(num, map.getOrDefault(num, 0) + 1);
//        }
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
//            .mapToInt(Integer::intValue)
//            .toArray();
//    }


// using max heap
//    public int[] topKFrequent(int[] nums, int k) {
//        List<Integer> result = new ArrayList<>();
//        Map<Integer, Integer> map = new HashMap<>();
//        for (int num : nums) {
//            map.put(num, map.getOrDefault(num, 0) + 1);
//        }
//        PriorityQueue<Integer> heap = new PriorityQueue<>(
//            (a,b) -> map.get(b) - map.get(a)
//        );
//        heap.addAll(map.keySet());
//        while (k>0){
//            result.add(heap.poll());
//            k--;
//        }
//        return result.stream()
//            .mapToInt(Integer::intValue)
//            .toArray();
//    }

// O(n) time
    public int[] topKFrequent(int[] nums, int k) {
        List<Integer> result = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        List<List<Integer>> bucket = Arrays.asList(new List[nums.length + 1]);
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (bucket.get(entry.getValue()) == null) {
                bucket.set(entry.getValue(), new ArrayList<>());
            }
            bucket.get(entry.getValue()).add(entry.getKey());

        }
        int n = nums.length;
        while (k > 0) {
            if (bucket.get(n) == null) {
                n--;
                continue;
            }
            int temp = Math.min(k, bucket.get(n).size());
            result.addAll(bucket.get(n).subList(0, temp));
            k -= temp;
            n--;
        }
        return result.stream()
            .mapToInt(Integer::intValue)
            .toArray();
    }

    public static void main(String[] args) {
        P0347_TopKFrequentElements sol = new P0347_TopKFrequentElements();
//        System.out.println(Arrays.toString(sol.topKFrequent(new int[]{1, 1, 1, 2, 2, 3}, 2)));
        System.out.println(Arrays.toString(sol.topKFrequent(new int[]{1,2,1,2,1,2,3,1,3,2}, 2)));
//        System.out.println(Arrays.toString(sol.topKFrequent(new int[]{1}, 1)));
    }
}
