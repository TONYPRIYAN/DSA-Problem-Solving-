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
    public ListNode reverseBetween(ListNode head, int left, int right) 
    {
       
       if(head == null || left == right) return head;

       ListNode dum = new ListNode(-1);
       dum.next = head;
       ListNode prev = dum;

        for(int i=0;i<left-1;i++)
        {
            prev = prev.next;
        }

        ListNode cur = prev.next;

        for(int i=0;i<right-left;i++)
        {
            ListNode tmp = cur.next;
            cur.next = tmp.next;
            tmp.next = prev.next;
            prev.next = tmp;
        }

        return dum.next;

        
    }
}