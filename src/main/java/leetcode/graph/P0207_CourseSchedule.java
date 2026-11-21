package leetcode.graph;

import static leetcode.common.Check.*;

/**
 * 207. Course Schedule (Medium) - https://leetcode.com/problems/course-schedule/
 * <p>
 * Idea: TODO
 * Time O(?), Space O(?).
 */
public class P0207_CourseSchedule {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        // TODO
        return false;
    }

    public static void main(String[] args) {
        P0207_CourseSchedule sol = new P0207_CourseSchedule();
        check(sol.canFinish(2, new int[][]{{1, 0}}), true);
        check(sol.canFinish(2, new int[][]{{1, 0}, {0, 1}}), false);
    }
}
