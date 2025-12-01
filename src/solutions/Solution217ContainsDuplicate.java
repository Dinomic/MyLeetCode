package solutions;

import java.util.HashMap;

public class Solution217ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Boolean> map =  new HashMap<>();
        for (int num : nums) {
            if (map.put(num, true) != null) return true;
        }
        return false;
    }
}
