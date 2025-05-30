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
    public ListNode partition(ListNode head, int x) 
    {

        if(head == null || head.next == null)
        {
            return head;
        }

        ListNode dummy1  = new ListNode(-1);
        ListNode dummy2  = new ListNode(-1);

        ListNode less  =  dummy1;
        ListNode great = dummy2;

        while(head != null)
        {
            if(head.val < x)
            {
               less.next = head;
               less = head;
            }
            else
            {
                great.next = head;
                great = head;
            }
            head = head.next;
        }

        great.next = null;
        less.next = dummy2.next;

        return dummy1.next;



 

        
    }
}