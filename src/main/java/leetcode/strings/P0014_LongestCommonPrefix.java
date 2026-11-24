package leetcode.strings;

import static leetcode.common.Check.*;

/**
 * 14. Longest Common Prefix (Easy) - https://leetcode.com/problems/longest-common-prefix/
 * <p>
 * Idea: TODO
 * Time O(?), Space O(?).
 */
public class P0014_LongestCommonPrefix {
//    public String longestCommonPrefix(String[] strs) {
//        StringBuilder result = new StringBuilder("");
//        if (strs.length == 1) return strs[0];
//        String sss = strs[0];
//        for (int i = 0; i < sss.length(); i++) {
//            Character ss = sss.charAt(i);
//            for (int j = 1; j < strs.length; j++) {
//                if (i == strs[j].length()) return result.toString();
//                if (strs[j].charAt(i) != ss) return result.toString();
//            }
//            result.append(ss);
//        }
//        return result.toString();
//    }

    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 1) return strs[0];
        String sss = strs[0];
        for (int i = 0; i < sss.length(); i++) {
            char ss = sss.charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (i == strs[j].length()) return sss.substring(0, i);
                if (strs[j].charAt(i) != ss) return sss.substring(0, i);
            }
        }
        return sss;
    }

    public static void main(String[] args) {
        P0014_LongestCommonPrefix sol = new P0014_LongestCommonPrefix();
        check(sol.longestCommonPrefix(new String[]{"flower", "flow", "flight"}), "fl");
        check(sol.longestCommonPrefix(new String[]{"dog", "racecar", "car"}), "");
        check(sol.longestCommonPrefix(new String[]{"a"}), "a");
    }
}
