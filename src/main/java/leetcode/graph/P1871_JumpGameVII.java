package leetcode.graph;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 1871. Jump Game VII (Medium) - https://leetcode.com/problems/jump-game-vii/
 * <p>
 * Idea: BFS over reachable '0' indices. {@code farthest} tracks the furthest index already
 * scanned, so each index is examined at most once.
 * Time O(n), Space O(n).
 */
public class P1871_JumpGameVII {
    public boolean canReach(String s, int minJump, int maxJump) {
        if (s.equals("0")) return true;
        Queue<Integer> queue = new LinkedList<>();
        queue.add(0);
        int farthest = 0;
        while (!queue.isEmpty()) {
            int t = queue.poll();
            for (int i = Math.max(t + minJump, farthest + 1); i <= Math.min(t + maxJump, s.length() - 1); i++) {
                if (s.charAt(i) == '0') {
                    queue.add(i);
                    if (i + 1 == s.length()) return true;
                }
            }
            farthest = t + maxJump;
        }
        return false;
    }

    public static void main(String[] args) {
        P1871_JumpGameVII sol = new P1871_JumpGameVII();
        System.out.println(sol.canReach("011010", 2, 3));
        System.out.println(sol.canReach("01101110", 2, 3));
        System.out.println(sol.canReach("0", 1, 1));
    }
}
