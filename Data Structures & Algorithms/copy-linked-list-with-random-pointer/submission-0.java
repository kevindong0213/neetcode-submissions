/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        Map<Node, Node> map = new HashMap<>();
        
        Node dummy = new Node(0);
        Node tail = dummy;

        Node cur = head;
        while (cur != null) {
            Node copy = new Node(cur.val);
            tail.next = copy;
            tail = copy;
            map.put(cur, copy);
            cur = cur.next;
        }

        cur = head;
        while (cur != null) {
           Node copy = map.get(cur);
           copy.random = map.get(cur.random);
           cur = cur.next;
        }

        return dummy.next;
    }
}
