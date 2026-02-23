import solutions.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Solution2AddTwoNumbers sol = new Solution2AddTwoNumbers();
        Solution2AddTwoNumbers.ListNode l1 = sol.intToListNode(9L);
        Solution2AddTwoNumbers.ListNode l2 = sol.intToListNode(9999999991L);
        System.out.println(sol.listNodeToInt(sol.addTwoNumbers(l1, l2)));
//        System.out.println(Arrays.toString(Arrays.stream(sol.topKFrequent(new int[]{3,2,3,1,2,4,5,5,6,7,7,8,2,3,1,1,1,10,11,5,6,2,4,7,8,5,6}, 10)).toArray()));
    }
}