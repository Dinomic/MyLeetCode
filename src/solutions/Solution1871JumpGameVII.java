package solutions;

import java.util.*;

public class Solution1871JumpGameVII {
    public boolean canReach(String s, int minJump, int maxJump) {
        if (s.equals("0")) return true;
        Queue<Integer> queue = new LinkedList<>();
        queue.add(0);
        Set<Integer> visited = new HashSet<>();
        visited.add(0);
        while (!queue.isEmpty()) {
            Integer t = queue.poll();
            for (int i = maxJump; i >= minJump; i--) {
                Integer now = t + i;
                if (visited.contains(now) || now > s.length() - 1) continue;
                if (s.charAt(now) == '0') {
                    queue.add(now);
                    if (now+1 == s.length()) return true;
                }
                visited.add(now);
            }
        }
        return false;
    }
}
