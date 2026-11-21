package leetcode.arrays;

import java.util.Arrays;

/**
 * 1920. Build Array from Permutation (Easy) - https://leetcode.com/problems/build-array-from-permutation/
 * <p>
 * Idea (in place): encode old and new value in one int as {@code old + n * new}.
 * {@code % n} recovers the old value, {@code / n} the new one. Note: modifies and returns the input array.
 * Time O(n), Space O(1).
 */
public class P1920_BuildArrayFromPermutation {
//    public int[] buildArray(int[] nums) {
//        int[] result = new int[nums.length];
//        for (int num : nums){
//            result[num] = nums[nums[num]];
//        }
////        for (int i =0; i<nums.length; i++){
////            result[i] = nums[nums[i]];
////        }
//        return result;
//    }

    public int[] buildArray(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            nums[i] += n * (nums[nums[i]] % n);
        }
        for (int i = 0; i < n; i++) {
            nums[i] = nums[i] / n;
        }
        return nums;
    }

    public static void main(String[] args) {
        P1920_BuildArrayFromPermutation sol = new P1920_BuildArrayFromPermutation();
        System.out.println(Arrays.toString(sol.buildArray(new int[]{0, 2, 1, 5, 3, 4})));
        System.out.println(Arrays.toString(sol.buildArray(new int[]{5, 0, 1, 2, 3, 4})));
    }
}
