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
class Solution 
{
    public static ListNode middle(ListNode head)
    {
        ListNode f = head;
        ListNode s = head;

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

        ListNode first = head;
        ListNode second = head2;

        while(second != null)
        {

            ListNode temp1 = first.next;
            ListNode temp2 = second.next;


            
            first.next = second;
            second.next = temp1;

            first = temp1;
            second = temp2;
        }
        
        
    }
}