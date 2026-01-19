package solutions;

public class Solution1891JumpGameVII {
    public boolean canReach(String s, int minJump, int maxJump) {
        if (s.equals("0")) return true;
        boolean flag = false;
        for (int i = maxJump; i >= minJump; i--){
            if (i > s.length() - 1) return flag;
            if (s.charAt(i) == '0') {
                flag = flag || canReach(s.substring(i), minJump, maxJump);
            }
        }
        return flag;
    }
}
