package solutions;

import java.util.HashMap;
import java.util.Map;

public class Solution1750MinimumLengthOfStringAfterDeletingSimilarEnds {
    public int minimumLength(String s) {
        int h = 0;
        int t = s.length() - 1;
        while (s.charAt(h) == s.charAt(t) && h < t) {
            do {
                h++;
            } while (h < s.length() - 1 && s.charAt(h) == s.charAt(h-1));

            do {
                t--;
            } while (t > 0 && s.charAt(t) == s.charAt(t+1));
        }
        if (h > t) return 0;
        return t - h + 1;
    }
}
