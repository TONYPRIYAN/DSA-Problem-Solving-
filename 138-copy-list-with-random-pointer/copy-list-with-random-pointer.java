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
    public Node copyRandomList(Node head) 
    {
        Map<Node,Node> map = new HashMap<>();

        Node tmp = head;

        while(tmp != null)
        {
            map.put(tmp,new Node(tmp.val));
            tmp = tmp.next;
        }

        tmp = head;
        while(tmp != null)
        {
            map.get(tmp).next = map.get(tmp.next);
            map.get(tmp).random = map.get(tmp.random);
            tmp = tmp.next;
        }

        return map.get(head);
    }
}