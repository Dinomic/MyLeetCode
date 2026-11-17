package leetcode.hashing;

import java.util.HashSet;
import java.util.Set;

/**
 * 217. Contains Duplicate (Easy) - https://leetcode.com/problems/contains-duplicate/
 * <p>
 * Idea: a set rejects the second occurrence of a value.
 * Time O(n), Space O(n).
 */
public class P0217_ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        for (int num : nums) {
            if (!seen.add(num)) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        P0217_ContainsDuplicate sol = new P0217_ContainsDuplicate();
        System.out.println(sol.containsDuplicate(new int[]{1, 2, 3, 1}));
        System.out.println(sol.containsDuplicate(new int[]{1, 2, 3, 4}));
        System.out.println(sol.containsDuplicate(new int[]{}));
    }
}
