package solutions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution2733NeitherMinimumNorMaximum {
    public int findNonMinOrMax(int[] nums) {
        if (nums == null || nums.length < 3) return -1;

//        int[] a = Arrays.stream(nums).sorted().toArray();
//        return a[1];

//        ------------------------------------

//        int i = 1;
//        int min = nums[0];
//        Integer max = null;
//        for (;i<nums.length;i++){
//            if (nums[i] == min){
//                continue;
//            }
//            if (nums[i] > min){
//                max = nums[i];
//                i++;
//                break;
//            }
//            if (nums[i] < min){
//                max = min;
//                min = nums[i];
//                i++;
//                break;
//            }
//        }
//
//        for (;i < nums.length; i++) {
//            if (nums[i] == max || nums[i] == min) continue;
//            if (nums[i] < min){
//                return min;
//            }
//            if(nums[i] > max){
//                return max;
//            }
//            if (nums[i] > min && nums[i] < max){
//                return nums[i];
//            }
//        }
//        return -1;

//        -----------------------------

        int min = 0;
        int max = 0;
        int i = 1;
        for (; i < nums.length; i++) {
            if (nums[i] == nums[min]){
                continue;
            }
            if (nums[i] > nums[min]){
                max = i;
                i++;
                break;
            }
            if (nums[i] < nums[min]){
                max = min;
                min = i;
                i++;
                break;
            }
        }

        for (;i < nums.length; i++) {
            if (nums[i] == nums[max] || nums[i] == nums[min]) continue;
            if (nums[i] < nums[min]){
                return nums[min];
            }
            if(nums[i] > nums[max]){
                return nums[max];
            }
            if (nums[i] > nums[min] && nums[i] < nums[max]){
                return nums[i];
            }
        }
        return -1;
    }
}
