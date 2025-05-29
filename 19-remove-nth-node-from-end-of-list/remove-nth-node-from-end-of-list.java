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
    public ListNode removeNthFromEnd(ListNode head, int n) 
    {

        if(head == null || head.next == null)
        {
            return null;
        }

        ListNode f = head;
        while(n>0)
        {
            f = f.next;
            n--;
        }

        if(f == null)
        {
            return head.next;
        }

        ListNode s = head;
        while(f.next != null)
        {
            s = s.next;
            f = f.next;
        }

        s.next = s.next.next;

        return head;
    }
}