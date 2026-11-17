package leetcode.arrays;

import java.util.ArrayList;
import java.util.List;

/**
 * 3285. Find Indices of Stable Mountains (Easy) - https://leetcode.com/problems/find-indices-of-stable-mountains/
 * <p>
 * Idea: mountain i (i >= 1) is stable when the previous mountain is higher than threshold.
 * Time O(n), Space O(1) extra.
 */
public class P3285_FindIndicesOfStableMountains {
    public List<Integer> stableMountains(int[] height, int threshold) {
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i < height.length; i++) {
            if (height[i - 1] > threshold) {
                result.add(i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        P3285_FindIndicesOfStableMountains sol = new P3285_FindIndicesOfStableMountains();
        System.out.println(sol.stableMountains(new int[]{1, 2, 3, 4, 5}, 2));
        System.out.println(sol.stableMountains(new int[]{10, 1, 10, 1, 10}, 3));
        System.out.println(sol.stableMountains(new int[]{10, 1, 10, 1, 10}, 10));
    }
}
