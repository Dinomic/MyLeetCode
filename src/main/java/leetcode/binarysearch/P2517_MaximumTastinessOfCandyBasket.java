package leetcode.binarysearch;

import java.util.Arrays;

/**
 * 2517. Maximum Tastiness of Candy Basket (Medium)
 * https://leetcode.com/problems/maximum-tastiness-of-candy-basket/
 * <p>
 * Idea: binary search on the answer. After sorting, greedily check whether k candies can be
 * picked with every pair at least {@code gap} apart.
 * Time O(n log n + n log maxPrice), Space O(1).
 */
public class P2517_MaximumTastinessOfCandyBasket {
    private boolean isOk(int[] price, int gap, int k) {
        int curIndex = 0;
        for (int i = 1; i < price.length; i++) {
            if (k == 1) return true;
            if (price[i] - price[curIndex] >= gap) {
                k--;
                curIndex = i;
            }
        }
        return k == 1;
    }

    public int maximumTastiness(int[] price, int k) {
        Arrays.sort(price);

        int left = 0;
        int right = price[price.length - 1];
        int mid = (left + right) / 2;
        int res = 0;

        while (left < right) {
            if (isOk(price, mid, k)) {
                res = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
            mid = (left + right) / 2;
        }
        return res;
    }

    public static void main(String[] args) {
        P2517_MaximumTastinessOfCandyBasket sol = new P2517_MaximumTastinessOfCandyBasket();
        System.out.println(sol.maximumTastiness(new int[]{13, 5, 1, 8, 21, 2}, 3));
        System.out.println(sol.maximumTastiness(new int[]{1, 3, 1}, 2));
        System.out.println(sol.maximumTastiness(new int[]{7, 7, 7, 7}, 2));
    }
}
