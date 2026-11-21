package leetcode.graph;

import java.util.*;
import static leetcode.common.Check.*;

/**
 * 210. Course Schedule II (Medium) - https://leetcode.com/problems/course-schedule-ii/
 * <p>
 * Idea: TODO
 * Time O(?), Space O(?).
 */
public class P0210_CourseScheduleII {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        // TODO
        return null;
    }

    /** Any valid topological order is accepted, so tests verify the order instead of comparing arrays. */
    static boolean isValidOrder(int numCourses, int[][] prerequisites, int[] order) {
        if (order == null || order.length != numCourses) {
            return false;
        }
        int[] pos = new int[numCourses];
        java.util.Arrays.fill(pos, -1);
        for (int i = 0; i < order.length; i++) {
            if (order[i] < 0 || order[i] >= numCourses || pos[order[i]] != -1) {
                return false;
            }
            pos[order[i]] = i;
        }
        for (int[] p : prerequisites) {
            if (pos[p[1]] > pos[p[0]]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        P0210_CourseScheduleII sol = new P0210_CourseScheduleII();
        int[][] p1 = {{1, 0}};
        check(isValidOrder(2, p1, sol.findOrder(2, p1)), true);
        int[][] p2 = {{1, 0}, {2, 0}, {3, 1}, {3, 2}};
        check(isValidOrder(4, p2, sol.findOrder(4, p2)), true);
        check(sol.findOrder(1, new int[][]{}), new int[]{0});
        check(sol.findOrder(2, new int[][]{{1, 0}, {0, 1}}), new int[]{}); // cycle -> empty array
    }
}
