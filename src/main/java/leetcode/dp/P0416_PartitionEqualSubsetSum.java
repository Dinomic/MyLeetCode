package leetcode.dp;

import static leetcode.common.Check.*;

/**
 * 416. Partition Equal Subset Sum (Medium) - https://leetcode.com/problems/partition-equal-subset-sum/
 * <p>
 * Idea: TODO
 * Time O(?), Space O(?).
 */
public class P0416_PartitionEqualSubsetSum {
    public boolean canPartition(int[] nums) {
        // TODO
        return false;
    }

    public static void main(String[] args) {
        P0416_PartitionEqualSubsetSum sol = new P0416_PartitionEqualSubsetSum();
        check(sol.canPartition(new int[]{1, 5, 11, 5}), true);
        check(sol.canPartition(new int[]{1, 2, 3, 5}), false);
    }
}
