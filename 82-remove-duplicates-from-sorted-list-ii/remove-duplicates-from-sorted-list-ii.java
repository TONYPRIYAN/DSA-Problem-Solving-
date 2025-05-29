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
    public ListNode deleteDuplicates(ListNode head) 
    {

        ListNode dummy = new ListNode(-1);
        ListNode head2 = dummy;
        dummy.next = head;

        ListNode tmp = head;
        ListNode prev = dummy;
        while(tmp != null )
        {
            if(tmp.next != null && tmp.val == tmp.next.val)
            {
                int value = tmp.val;
                while(tmp != null && tmp.val == value)
                {
                    tmp = tmp.next;
                   
                }
                 prev.next = tmp;
            }
            else
            {
                prev = prev.next;
                tmp = tmp.next;
            }
        }

        return dummy.next;
        
    }
}