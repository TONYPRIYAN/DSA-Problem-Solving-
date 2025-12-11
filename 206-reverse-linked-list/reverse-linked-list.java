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
        if(head == null || head.next == null) return head;


        ListNode tmp = head;
        ListNode nxt = null;
        ListNode prev = null;

        while(tmp != null)
        {
            nxt = tmp.next;
            tmp.next = prev;
            prev = tmp;
            tmp = nxt;
        }

        return prev;


        
    }
}