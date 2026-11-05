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
        ListNode slow = head;
        ListNode fast = head;

        while (fast.next != null && fast.next.next !=null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode reverse = slow.next; 
        slow.next = null;

        ListNode prev = null;
        while (reverse != null) {
            ListNode next = reverse.next;
            reverse.next = prev;
            prev = reverse;
            reverse = next;
        }


        ListNode cur = head;
        ListNode t1 = head;
        ListNode t2 = prev;
        while (prev != null) {
            t1 = cur.next;
            cur.next = prev;
            cur = t1;
            t2 = prev.next;
            prev.next = cur;
            prev = t2;
        }
    }
}
