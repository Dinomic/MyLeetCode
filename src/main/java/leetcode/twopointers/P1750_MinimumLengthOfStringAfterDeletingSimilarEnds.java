package leetcode.twopointers;

/**
 * 1750. Minimum Length of String After Deleting Similar Ends (Medium)
 * https://leetcode.com/problems/minimum-length-of-string-after-deleting-similar-ends/
 * <p>
 * Idea: two pointers from both ends; while the end characters match, skip the whole run of
 * that character on both sides.
 * Time O(n), Space O(1).
 */
public class P1750_MinimumLengthOfStringAfterDeletingSimilarEnds {
    public int minimumLength(String s) {
        int h = 0;
        int t = s.length() - 1;
        while (h < t && s.charAt(h) == s.charAt(t)) {
            do {
                h++;
            } while (h < s.length() - 1 && s.charAt(h) == s.charAt(h - 1));

            do {
                t--;
            } while (t > 0 && s.charAt(t) == s.charAt(t + 1));
        }
        if (h > t) return 0;
        return t - h + 1;
    }

    public static void main(String[] args) {
        P1750_MinimumLengthOfStringAfterDeletingSimilarEnds sol = new P1750_MinimumLengthOfStringAfterDeletingSimilarEnds();
        System.out.println(sol.minimumLength("ca"));
        System.out.println(sol.minimumLength("cabaabac"));
        System.out.println(sol.minimumLength("aabccabba"));
        System.out.println(sol.minimumLength("a"));
        System.out.println(sol.minimumLength("aaaa"));
    }
}
