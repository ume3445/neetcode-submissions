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
    public void reorderList(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        ListNode secondhalf = slow.next;
        slow.next = null;
        ListNode curr = secondhalf;
        ListNode prev = null;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;   
        }

        ListNode curr1 = head;
        while(curr1 != null && prev != null) {
            ListNode temp1 = curr1.next;
            ListNode temp2 = prev.next;
            curr1.next = prev;
            prev.next = temp1;
            curr1 = temp1;
            prev = temp2;
        }
    }
}
