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
    public ListNode middleNode(ListNode head) {
        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode back = dummy;
        ListNode front = dummy;
        int length = 0; 
        while (dummy != null) {
            dummy = dummy.next;
            length++;
        }

        int mid = length/2;
        for (int i = 0;i < mid;i++) {
            front = front.next;
        }
        while (front.next != null) {
            front = front.next;
            back = back.next;
        }

        return back.next;
    }
}