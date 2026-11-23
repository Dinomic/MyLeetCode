package leetcode.arrays;

import static leetcode.common.Check.*;

/**
 * 238. Product of Array Except Self (Medium) - https://leetcode.com/problems/product-of-array-except-self/
 * <p>
 * Idea: TODO
 * Time O(?), Space O(?).
 */
public class P0238_ProductOfArrayExceptSelf {
//    public int[] productExceptSelf(int[] nums) {
//        int[] res = new int[nums.length];
//        res[0] = nums[1];
//        res[1] = nums[0];
//        for (int i = 2; i < nums.length; i++) {
//            res[i] = res[i-1] * nums[i-1];
//            for (int j = 0; j < i; j++) {
//                res[j] *= nums[i];
//            }
//        }
//        return res;
//    }

//    public int[] productExceptSelf(int[] nums) {
//        int[] res = new int[nums.length];
//        int[] suf = new int[nums.length];
//        int[] pre = new int[nums.length];
//        pre[0] = 1;
//        for (int i = 1; i < nums.length; i++) {
//            pre[i] = pre[i - 1] * nums[i - 1];
//        }
//        suf[nums.length - 1] = 1;
//        for (int i = nums.length - 2; i >= 0; i--) {
//            suf[i] = suf[i + 1] * nums[i + 1];
//        }
//        for (int i = 0; i < nums.length; i++) {
//            res[i] = pre[i] * suf[i];
//        }
//        return res;
//    }

    public int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];
        int[] pre = new int[nums.length];
        pre[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            pre[i] = pre[i - 1] * nums[i - 1];
        }
        int temp = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            res[i] = pre[i] * temp;
            temp *= nums[i];
        }
        return res;
    }

    public static void main(String[] args) {
        P0238_ProductOfArrayExceptSelf sol = new P0238_ProductOfArrayExceptSelf();
        check(sol.productExceptSelf(new int[]{1, 2, 3, 4}), new int[]{24, 12, 8, 6});
        check(sol.productExceptSelf(new int[]{-1, 1, 0, -3, 3}), new int[]{0, 0, 9, 0, 0});
    }
}
