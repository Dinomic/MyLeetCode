package solutions.s1_medium;

import java.math.BigInteger;

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

//    public BigInteger listNodeToInt(ListNode head) {
//        BigInteger res = BigInteger.ZERO;
//        BigInteger i = BigInteger.ONE;
//        while (head != null) {
//            res = res.add(i.multiply(BigInteger.valueOf(head.val)));
//            i = i.multiply(BigInteger.TEN);
//            head = head.next;
//        }
//        return res;
//    }
//
//    public ListNode intToListNode(BigInteger val) {
//        if (BigInteger.ZERO.compareTo(val) < 0) {
//            return new ListNode(val.mod(BigInteger.TEN).intValue(), intToListNode((val.subtract(val.mod(BigInteger.TEN)).divide(BigInteger.TEN))));
//        }
//        return null;
//    }
//
//    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//
//        BigInteger n1 = listNodeToInt(l1);
//        BigInteger n2 = listNodeToInt(l2);
//
//        BigInteger sum = n1.add(n2);
//        return BigInteger.ZERO.equals(sum) ? new ListNode(0) : intToListNode(sum);
//    }
//    cũng hay đó, nhưng mà đề không muốn m làm vậy =))



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
