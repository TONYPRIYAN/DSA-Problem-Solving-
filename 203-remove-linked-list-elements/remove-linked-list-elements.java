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
    public ListNode removeElements(ListNode head, int val) 
    {

        while(head != null && head.val == val)
        {
            head = head.next;
        }

        ListNode tmp = head;

        while(tmp != null && tmp.next != null)
        {
            if(tmp.next.val == val)
            {
                tmp.next = tmp.next.next;
            }
            else
            {
                tmp = tmp.next;
            }
        }

        return head;
        
    }
}