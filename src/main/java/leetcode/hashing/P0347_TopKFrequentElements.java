package leetcode.hashing;

import java.util.*;

/**
 * 347. Top K Frequent Elements (Medium) - https://leetcode.com/problems/top-k-frequent-elements/
 * <p>
 * Idea: count frequencies, then bucket numbers by frequency (a frequency is at most nums.length)
 * and read buckets from the highest frequency down until k numbers are collected.
 * Time O(n), Space O(n).
 */
public class P0347_TopKFrequentElements {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> count = new HashMap<>();
        for (int num : nums) {
            count.merge(num, 1, Integer::sum);
        }

        List<List<Integer>> buckets = new ArrayList<>(Collections.nCopies(nums.length + 1, null));
        for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
            int freq = entry.getValue();
            if (buckets.get(freq) == null) {
                buckets.set(freq, new ArrayList<>());
            }
            buckets.get(freq).add(entry.getKey());
        }

        int[] result = new int[k];
        int filled = 0;
        for (int freq = nums.length; freq > 0 && filled < k; freq--) {
            List<Integer> bucket = buckets.get(freq);
            if (bucket == null) continue;
            for (int num : bucket) {
                if (filled == k) break;
                result[filled++] = num;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        P0347_TopKFrequentElements sol = new P0347_TopKFrequentElements();
        System.out.println(Arrays.toString(sol.topKFrequent(new int[]{1, 1, 1, 2, 2, 3}, 2)));
        System.out.println(Arrays.toString(sol.topKFrequent(new int[]{1}, 1)));
    }
}
