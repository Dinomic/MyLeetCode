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

    public int listNodeToInt(ListNode head) {
        int res = 0;
        int i = 1;
        while (head != null) {
            res = head.val * i;
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

        int val1;
        int val2;
        int carry = 0;
        ListNode result = new ListNode();
        ListNode head = result;

        while (l1 != null || l2 != null || carry != 0) {

            if (l1 != null) {
                val1 = l1.val;
            } else {
                val1 = 0;
            }
            if (l2 != null) {
                val2 = l2.val;
            } else {
                val2 = 0;
            }
            int t =  val1 + val2 + carry;
            head.next = new ListNode(t % 10);
            carry = t / 10;
            head = head.next;
            if (l1 != null) {l1 = l1.next;}
            if (l2 != null) {l2 = l2.next;}
        }
        return result.next;
    }


}
