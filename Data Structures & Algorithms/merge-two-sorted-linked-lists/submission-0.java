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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode curr1 = list1;
        ListNode curr2 = list2;
        ListNode dummy = new ListNode(0);
        ListNode currDummy = dummy;
        while (curr1 != null && curr2 != null) {
            if (curr1.val > curr2.val) {
                currDummy.next = curr2;
                currDummy = currDummy.next;
                curr2 = curr2.next;
            } else if (curr2.val > curr1.val) {
                currDummy.next = curr1;
                currDummy = currDummy.next;
                curr1 = curr1.next;
            } else {
                currDummy.next = curr1;
                currDummy = currDummy.next;
                curr1 = curr1.next;
                currDummy.next = curr2;
                currDummy = currDummy.next;
                curr2 = curr2.next;
            }
        }
        if (curr1 != null) currDummy.next = curr1;
        if (curr2 != null) currDummy.next = curr2;
        return dummy.next;
    }
}