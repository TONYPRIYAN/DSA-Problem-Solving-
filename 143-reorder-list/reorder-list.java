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

    public ListNode middle(ListNode node)
    {

        ListNode f = node;
        ListNode s = node;

        while(f != null && f.next != null)
        {
            f = f.next.next;
            s = s.next;
        }

        return s;

    }


    public void reorderList(ListNode head) 
    {

        //Finding mid
        ListNode mid = middle(head);

        ListNode head2 = mid.next;
        mid.next = null;

        //Reverse the second part

        ListNode r2 = head2;
        ListNode r2prev = null;

        while(r2 != null)
        {
            ListNode r2next = r2.next;
            r2.next = r2prev;
            r2prev = r2;
            r2 = r2next;
        }

        head2 = r2prev;

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