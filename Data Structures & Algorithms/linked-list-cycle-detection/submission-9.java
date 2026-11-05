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
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        ListNode cur = head;
        ListNode detect = head;
        while (detect != null) {
            cur = cur.next;
            if (detect.next != null) {
                detect = detect.next.next;
            } else {
                return false;
            }
            if (cur == detect) {
                return true; 
            }
        }
        return false;
    }
}
