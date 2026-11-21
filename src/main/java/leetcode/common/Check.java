package leetcode.common;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Tiny assertion helper for the {@code main} methods: prints PASS/FAIL per test case.
 * Works with primitives, arrays (any depth), lists and strings.
 */
public final class Check {
    private static int counter = 0;

    private Check() {
    }

    /** Exact comparison. Arrays are compared by content. */
    public static void check(Object actual, Object expected) {
        report(str(actual).equals(str(expected)), actual, expected);
    }

    /** Doubles within 1e-5 (LeetCode's usual tolerance). */
    public static void checkApprox(double actual, double expected) {
        report(Math.abs(actual - expected) < 1e-5, actual, expected);
    }

    /** Outer list order does not matter; inner order does (e.g. permutations, N-Queens boards). */
    public static void checkAnyOrder(List<?> actual, List<?> expected) {
        report(sortedOuter(actual).equals(sortedOuter(expected)), actual, expected);
    }

    /** Same as above for an array of rows, e.g. {@code int[][]}. */
    public static void checkAnyOrder(Object[] actual, Object[] expected) {
        checkAnyOrder(actual == null ? null : Arrays.asList(actual), Arrays.asList(expected));
    }

    /** Neither outer nor inner order matters (e.g. subsets, anagram groups). */
    public static void checkSets(List<? extends List<?>> actual, List<? extends List<?>> expected) {
        report(sortedBoth(actual).equals(sortedBoth(expected)), actual, expected);
    }

    private static void report(boolean ok, Object actual, Object expected) {
        counter++;
        if (ok) {
            System.out.println("Test " + counter + ": PASS");
        } else {
            System.out.println("Test " + counter + ": FAIL  expected=" + str(expected) + "  actual=" + str(actual));
        }
    }

    private static String str(Object o) {
        return Arrays.deepToString(new Object[]{o});
    }

    private static List<String> sortedOuter(List<?> list) {
        List<String> out = new ArrayList<>();
        if (list == null) {
            return out;
        }
        for (Object o : list) {
            out.add(str(o));
        }
        out.sort(Comparator.naturalOrder());
        return out;
    }

    private static List<String> sortedBoth(List<? extends List<?>> list) {
        List<String> out = new ArrayList<>();
        if (list == null) {
            return out;
        }
        for (List<?> inner : list) {
            List<String> items = new ArrayList<>();
            for (Object o : inner) {
                items.add(str(o));
            }
            items.sort(Comparator.naturalOrder());
            out.add(items.toString());
        }
        out.sort(Comparator.naturalOrder());
        return out;
    }
}
