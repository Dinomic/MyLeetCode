package leetcode.hashing;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import static leetcode.common.Check.*;

/**
 * 128. Longest Consecutive Sequence (Medium) - https://leetcode.com/problems/longest-consecutive-sequence/
 * <p>
 * Idea: TODO
 * Time O(?), Space O(?).
 */
public class P0128_LongestConsecutiveSequence {
//    public int longestConsecutive(int[] nums) {
//        Set<Integer> contain = new HashSet<>();
//        for (int num : nums) {
//            contain.add(num);
//        }
//        Set<Integer> calculated = new HashSet<>();
//        Map<Integer, Integer> map = new HashMap<>();
//
//        for (int num : nums) {
//            calculate(contain, calculated, map, num);
//        }
//
//        int max = 0;
//        for (Integer value : map.values()){
//            if (value > max) max = value;
//        }
//
//        return max;
//    }
//
//    private void calculate(Set<Integer> contain, Set<Integer> calculated, Map<Integer, Integer> map, int current) {
//        if (calculated.contains(current)) return;
//        if (contain.contains(current+1)) {
//            calculate(contain, calculated, map, current + 1);
//            map.put(current, 1 + map.get(current + 1));
//        } else {
//            map.put(current, 1);
//        }
//        calculated.add(current);
//    }

    public int longestConsecutive(int[] nums) {
        int result = 0;
        Set<Integer> set = new HashSet<>();
        for (int num : nums) set.add(num);

        for (int num : set) {
            if (set.contains(num - 1)) continue;

            int count = 1;
            int t = num + 1;
            while (set.contains(t)){
                count++;
                t++;
            }

            if (count > result) {
                result = count;
            }
        }
        return result;
    }


    public static void main(String[] args) {
        P0128_LongestConsecutiveSequence sol = new P0128_LongestConsecutiveSequence();
        check(sol.longestConsecutive(new int[]{100, 4, 200, 1, 3, 2}), 4);
        check(sol.longestConsecutive(new int[]{0, 3, 7, 2, 5, 8, 4, 6, 0, 1}), 9);
        check(sol.longestConsecutive(new int[]{1, 0, 1, 2}), 3);
        check(sol.longestConsecutive(new int[]{}), 0);
    }
}
