package solutions;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
public class Solution2AddTwoNumbers {

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public BigInteger listNodeToInt(ListNode head) {
        BigInteger res = BigInteger.ZERO;
        int i = 1;
        while (head != null) {
            res = res.add(BigInteger.valueOf(head.val * i));
            i *= 10;
            head = head.next;
        }
        return res;
    }

    public ListNode intToListNode(Long val) {
        if (val > 0) {
            return new ListNode((int) (val % 10), intToListNode((val - (val % 10))/10));
        }
        return null;
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        BigInteger n1 = listNodeToInt(l1);
        BigInteger n2 = listNodeToInt(l2);

        BigInteger sum = n1 + n2;
        return sum == 0 ? new ListNode(0) : intToListNode(n1 + n2);
    }


}
