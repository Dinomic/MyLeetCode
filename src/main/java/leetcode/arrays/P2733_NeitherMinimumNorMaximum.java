package leetcode.arrays;

/**
 * 2733. Neither Minimum nor Maximum (Easy) - https://leetcode.com/problems/neither-minimum-nor-maximum/
 * <p>
 * Idea: single pass keeping the indices of the current min and max seen so far (skipping duplicates
 * of them); the first value strictly between them, or one that exceeds them (making the old
 * min/max a valid answer), is returned.
 * Time O(n), Space O(1).
 */
public class P2733_NeitherMinimumNorMaximum {
//    public int findNonMinOrMax(int[] nums) {
//        if (nums == null || nums.length < 3) return -1;
//
//        int min = 0;
//        int max = 0;
//        int i = 1;
//        for (; i < nums.length; i++) {
//            if (nums[i] == nums[min]) {
//                continue;
//            }
//            if (nums[i] > nums[min]) {
//                max = i;
//                i++;
//                break;
//            }
//            if (nums[i] < nums[min]) {
//                max = min;
//                min = i;
//                i++;
//                break;
//            }
//        }
//
//        for (; i < nums.length; i++) {
//            if (nums[i] == nums[max] || nums[i] == nums[min]) continue;
//            if (nums[i] < nums[min]) {
//                return nums[min];
//            }
//            if (nums[i] > nums[max]) {
//                return nums[max];
//            }
//            return nums[i];
//        }
//        return -1;
//    }
    public int findNonMinOrMax(int[] nums) {
        if (nums == null || nums.length < 3) return -1;
        int min = nums[0];
        int max = nums[0];
        if (nums[1] > max) {
            max = nums[1];
        }
        if (nums[1] < min) {
            min = nums[1];
        }
        if (nums[2] < min) return min;
        if (nums[2] > max) return max;
        return nums[2];

    }

    public static void main(String[] args) {
        P2733_NeitherMinimumNorMaximum sol = new P2733_NeitherMinimumNorMaximum();
        System.out.println(sol.findNonMinOrMax(new int[]{3, 2, 1, 4}));
        System.out.println(sol.findNonMinOrMax(new int[]{1, 2}));
        System.out.println(sol.findNonMinOrMax(new int[]{2, 1, 3}));
        System.out.println(sol.findNonMinOrMax(new int[]{1, 3, 2}));
        System.out.println(sol.findNonMinOrMax(new int[]{3, 3, 3, 1, 2}));
    }
}
