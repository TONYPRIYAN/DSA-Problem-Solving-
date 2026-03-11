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

    public ListNode middle(ListNode head)
    {

        ListNode s = head;
        ListNode f = head;

        while(f != null && f.next != null)
        {
            f = f.next.next;
            s = s.next;
            
        }

        return s;
    }

    public void reorderList(ListNode head) 
    {

        ListNode mid = middle(head);
        ListNode head2 = mid.next;
        mid.next = null;

        ListNode prev = null;
        ListNode nxt = null;

        ListNode tmp = head2;

        while(tmp != null)
        {
            nxt = tmp.next;
            tmp.next = prev;
            prev = tmp;
            tmp = nxt;
        }

        head2 = prev;


        ListNode first  = head;
        ListNode second = head2;

        while(second != null)
        {
            ListNode tmp1 = first.next;
            ListNode tmp2 = second.next;

            first.next = second;
            second.next = tmp1;

            first = tmp1;
            second = tmp2;

        }


        
    }
}