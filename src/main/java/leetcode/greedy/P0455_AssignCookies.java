package leetcode.greedy;

import static leetcode.common.Check.*;

/**
 * 455. Assign Cookies (Easy) - https://leetcode.com/problems/assign-cookies/
 * <p>
 * Idea: TODO
 * Time O(?), Space O(?).
 */
public class P0455_AssignCookies {
    public int findContentChildren(int[] g, int[] s) {
        // TODO
        return 0;
    }

    public static void main(String[] args) {
        P0455_AssignCookies sol = new P0455_AssignCookies();
        check(sol.findContentChildren(new int[]{1, 2, 3}, new int[]{1, 1}), 1);
        check(sol.findContentChildren(new int[]{1, 2}, new int[]{1, 2, 3}), 2);
    }
}
