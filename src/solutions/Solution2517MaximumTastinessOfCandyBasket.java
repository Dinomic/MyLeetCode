package solutions;

import java.util.Arrays;

public class Solution2517MaximumTastinessOfCandyBasket {
    private boolean isOk(int[] price, int max, int k) {
        int cur_index = 0;
        for (int i = 1; i < price.length; i++) {
            if (k == 1) return true;
            if (price[i] - price[cur_index] >= max) {
                k--;
                cur_index = i;
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
}
