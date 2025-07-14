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
    public int getDecimalValue(ListNode head)
    {
        if(head.next == null)
        {
            return head.val;
        }

       int sum = 0;
       int i=0;

        while(head != null)
        {
           sum *= 2;
           sum += head.val;
           head = head.next;
        }

        return sum;
        
        
    }
}