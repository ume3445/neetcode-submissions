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

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode res = dummy;
        ListNode curr1 = l1;
        ListNode curr2 = l2;
        int carry = 0;

        while (curr1 != null || curr2 != null || carry != 0) {
            int add1 = 0;
            int add2 = 0;
            if (curr1 != null) {
                add1 = curr1.val;
                curr1 = curr1.next;
            }
            if (curr2 != null) {
                add2 = curr2.val;
                curr2 = curr2.next;
            }
            int sum = add1 + add2 + carry;
            if (sum >= 10) {
                carry = sum / 10;
                res.next = new ListNode(sum % 10);
                res = res.next;
                continue;
            } else {
                res.next = new ListNode(sum);
                res = res.next;
                carry = 0;
                continue;
            }
        }
        return dummy.next;
    }
}
