package solutions;

import java.util.Arrays;

public class Solution242ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if (s == null || t == null || s.length() != t.length()) {return false;}
        
//        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
//        for (char c : s.toCharArray()) {
//            map.put(c, map.getOrDefault(c, 0) + 1);;
//        }
//        for (char c : t.toCharArray()) {
//            Integer temp = map.get(c);
//            if (temp == null || temp == 0) {return false;}
//            map.put(c, temp - 1);;
//        }
//        return true;

        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        String ssorted = new String(chars);

        chars = t.toCharArray();
        Arrays.sort(chars);
        String tsorted = new String(chars);

        return ssorted.equals(tsorted);
    }
}
