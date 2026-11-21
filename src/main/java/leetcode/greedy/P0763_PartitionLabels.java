package leetcode.greedy;

import java.util.*;
import static leetcode.common.Check.*;

/**
 * 763. Partition Labels (Medium) - https://leetcode.com/problems/partition-labels/
 * <p>
 * Idea: TODO
 * Time O(?), Space O(?).
 */
public class P0763_PartitionLabels {
    public List<Integer> partitionLabels(String s) {
        // TODO
        return null;
    }

    public static void main(String[] args) {
        P0763_PartitionLabels sol = new P0763_PartitionLabels();
        check(sol.partitionLabels("ababcbacadefegdehijhklij"), List.of(9, 7, 8));
        check(sol.partitionLabels("eccbbbbdec"), List.of(10));
    }
}
