package solutions;

import java.util.HashMap;
import java.util.Map;

public class Solution1920BuildArrayFromPermutation {
    public int[] buildArray(int[] nums) {
//        int[] res = new int[nums.length];
//        for  (int i = 0; i < nums.length; i++) {
//            res[i] = nums[nums[i]];
//        }
//        return res;
        int n = nums.length;
        for (int i = 0;i < n; i++){
           nums[i] += n*(nums[nums[i]] % n);
        }
        for (int i = 0; i < n; i++) {
            nums[i] /= n;
        }
        return nums;
    }
}
