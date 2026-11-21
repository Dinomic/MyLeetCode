package leetcode.greedy;

import static leetcode.common.Check.*;

/**
 * 1899. Merge Triplets to Form Target Triplet (Medium) - https://leetcode.com/problems/merge-triplets-to-form-target-triplet/
 * <p>
 * Idea: TODO
 * Time O(?), Space O(?).
 */
public class P1899_MergeTripletsToFormTargetTriplet {
    public boolean mergeTriplets(int[][] triplets, int[] target) {
        // TODO
        return false;
    }

    public static void main(String[] args) {
        P1899_MergeTripletsToFormTargetTriplet sol = new P1899_MergeTripletsToFormTargetTriplet();
        check(sol.mergeTriplets(new int[][]{{2, 5, 3}, {1, 8, 4}, {1, 7, 5}}, new int[]{2, 7, 5}), true);
        check(sol.mergeTriplets(new int[][]{{3, 4, 5}, {4, 5, 6}}, new int[]{3, 2, 5}), false);
        check(sol.mergeTriplets(new int[][]{{2, 5, 3}, {2, 3, 4}, {1, 2, 5}, {5, 2, 3}}, new int[]{5, 5, 5}), true);
    }
}
