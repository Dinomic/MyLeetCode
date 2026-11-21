package leetcode.heap;

import static leetcode.common.Check.*;

/**
 * 621. Task Scheduler (Medium) - https://leetcode.com/problems/task-scheduler/
 * <p>
 * Idea: TODO
 * Time O(?), Space O(?).
 */
public class P0621_TaskScheduler {
    public int leastInterval(char[] tasks, int n) {
        // TODO
        return 0;
    }

    public static void main(String[] args) {
        P0621_TaskScheduler sol = new P0621_TaskScheduler();
        check(sol.leastInterval(new char[]{'A', 'A', 'A', 'B', 'B', 'B'}, 2), 8);
        check(sol.leastInterval(new char[]{'A', 'A', 'A', 'B', 'B', 'B'}, 0), 6);
        check(sol.leastInterval(new char[]{'A', 'A', 'A', 'A', 'A', 'A', 'B', 'C', 'D', 'E', 'F', 'G'}, 2), 16);
    }
}
