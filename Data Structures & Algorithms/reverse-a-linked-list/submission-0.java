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
    public ListNode reverseList(ListNode head) {
        ListNode dumb = null;
        ListNode left = head;
        if (head == null) {
            return null;
        }
        ListNode right = head.next;

        while (right != null) {
            left.next = dumb;
            dumb = left;
            left = right;
            right = right.next;  
        }
        left.next = dumb;
        return left;
    }  
}
