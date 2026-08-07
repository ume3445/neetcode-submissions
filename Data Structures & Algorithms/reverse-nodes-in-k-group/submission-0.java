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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode groupPrev = dummy;

        while (true) {
            ListNode kth = groupPrev;
            for (int i = 0; i < k; i++) {
                if (kth == null) {
                    return dummy.next;
                } else {
                    kth = kth.next;
                }
            }
            if (kth == null) return dummy.next;
            ListNode nextGroup = kth.next;
            kth.next = null;

            ListNode curr = groupPrev.next;
            reverseList(curr);
            groupPrev.next = kth;
            curr.next = nextGroup;
            groupPrev = curr;
        }
        
    }

    public ListNode reverseList(ListNode l1) {
        ListNode curr = l1;
        ListNode prev = null;

        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
