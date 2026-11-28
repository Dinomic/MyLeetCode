package leetcode.strings;

import java.util.HashMap;
import java.util.Map;

import static leetcode.common.Check.*;

/**
 * 409. Longest Palindrome (Easy) - https://leetcode.com/problems/longest-palindrome/
 * <p>
 * Idea: TODO
 * Time O(?), Space O(?).
 */
public class P0409_LongestPalindrome {
    public int longestPalindrome(String s) {
        Map<Character, Integer> count = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            Integer t = count.get(s.charAt(i));
            if (t == null) {
                count.put(s.charAt(i), 1);
            } else {
                count.put(s.charAt(i), count.get(s.charAt(i)) + 1);
            }
        }
        int result = 0;
        boolean a = false;
        for (Integer t : count.values()) {
            if (t % 2 == 0) {
                result += t;
            } else {
                a = true;
                result += t - 1;
            }
        }
        return result + (a ? 1 : 0);
    }

    public static void main(String[] args) {
        P0409_LongestPalindrome sol = new P0409_LongestPalindrome();
        check(sol.longestPalindrome("civilwartestingwhetherthatnaptionoranynartionsoconceivedandsodedicatedcanlongendureWeareqmetonagreatbattlefiemldoftzhatwarWehavecometodedicpateaportionofthatfieldasafinalrestingplaceforthosewhoheregavetheirlivesthatthatnationmightliveItisaltogetherfangandproperthatweshoulddothisButinalargersensewecannotdedicatewecannotconsecratewecannothallowthisgroundThebravelmenlivinganddeadwhostruggledherehaveconsecrateditfaraboveourpoorponwertoaddordetractTgheworldadswfilllittlenotlenorlongrememberwhatwesayherebutitcanneverforgetwhattheydidhereItisforusthelivingrathertobededicatedheretotheulnfinishedworkwhichtheywhofoughtherehavethusfarsonoblyadvancedItisratherforustobeherededicatedtothegreattdafskremainingbeforeusthatfromthesehonoreddeadwetakeincreaseddevotiontothatcauseforwhichtheygavethelastpfullmeasureofdevotionthatweherehighlyresolvethatthesedeadshallnothavediedinvainthatthisnationunsderGodshallhaveanewbirthoffreedomandthatgovernmentofthepeoplebythepeopleforthepeopleshallnotperishfromtheearth"), 983);
//        check(sol.longestPalindrome("a"), 1);
//        check(sol.longestPalindrome("Aa"), 1);
    }
}
