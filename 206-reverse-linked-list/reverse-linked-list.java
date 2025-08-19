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
    public ListNode reverseList(ListNode head) 
    {

        return reverse(head);
    }

    public ListNode reverse(ListNode node)
    {
        if(node == null || node.next == null) return node;

        ListNode newHead = reverse(node.next);

        node.next.next = node;
        node.next = null;

        return newHead; 
    }



}