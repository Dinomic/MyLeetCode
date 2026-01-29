package solutions;

import java.util.*;

public class Solution1871JumpGameVII {

    // Note how the farthest work. This make the iteration do not repeat on duplicate elements .
    public boolean canReach(String s, int minJump, int maxJump) {
        if (s.equals("0")) return true;
        Queue<Integer> queue = new LinkedList<>();
        queue.add(0);
        Integer farthest = 0;
        while (!queue.isEmpty()) {
            Integer t = queue.poll();
            for (int i = Math.max(t+minJump, farthest+1); i <= Math.min(t+maxJump, s.length()-1); i++) {
                if (s.charAt(i) == '0') {
                    queue.add(i);
                    if (i+1 == s.length()) return true;
                }
            }
            farthest = t+maxJump;
        }
        return false;
    }
}
