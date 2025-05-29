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
    public ListNode rotateRight(ListNode head, int k) 
    {

        if(head == null || head.next == null || k==0)
        {
            return head;
        }

        int len = 1;
        ListNode tmp = head;

        while(tmp.next != null)
        {
            len++;
            tmp = tmp.next;
        }

        tmp.next = head;

         k = k%len;
        int rot = len - k;

        ListNode newhead = null;
        ListNode newtail = head;

        for(int i=1;i<rot;i++)
        {
            newtail = newtail.next;
        }
        newhead = newtail.next;
        newtail.next = null;


       return newhead;






        
    }
}