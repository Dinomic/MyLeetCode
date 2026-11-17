package leetcode.linkedlist;

import leetcode.common.ListNode;

/**
 * 2. Add Two Numbers (Medium) - https://leetcode.com/problems/add-two-numbers/
 * <p>
 * Idea: walk both lists digit by digit (least significant first), carrying over like manual addition.
 * Time O(max(m, n)), Space O(1) extra (output list excluded).
 */
public class P0002_AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode();
        ListNode tail = dummy;
        int carry = 0;
        while (l1 != null || l2 != null || carry != 0) {
            int sum = carry;
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            tail.next = new ListNode(sum % 10);
            tail = tail.next;
            carry = sum / 10;
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        P0002_AddTwoNumbers sol = new P0002_AddTwoNumbers();
        System.out.println(ListNode.toList(sol.addTwoNumbers(ListNode.of(2, 4, 3), ListNode.of(5, 6, 4))));
        System.out.println(ListNode.toList(sol.addTwoNumbers(ListNode.of(0), ListNode.of(0))));
        // 9 + 9999999991 = 10000000000
        System.out.println(ListNode.toList(sol.addTwoNumbers(ListNode.of(9), ListNode.of(1, 9, 9, 9, 9, 9, 9, 9, 9, 9))));
    }
}
