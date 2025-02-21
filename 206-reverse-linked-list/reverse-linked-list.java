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
    public ListNode reverseList(ListNode head) 
    {
        if(head == null)
        {
            return null;
        }

        ListNode tmp = head;
        ListNode tmp1 = null;
        ListNode tmp2 = null;

        while(tmp != null)
        {
            tmp1 = tmp.next;
            tmp.next = tmp2;
            tmp2 = tmp;
            tmp = tmp1;
            
        }

        return tmp2;
        
    }
}