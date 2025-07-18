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
    public ListNode oddEvenList(ListNode head) 
    {
        ListNode odd = new ListNode(-1);
        ListNode oddhead = odd;

        ListNode even = new ListNode(-1);
        ListNode evenhead = even;

        ListNode tmp = head;
        int i=1;

        while(tmp != null)
        {
            if(i %2 == 1)
            {
                odd.next = tmp;
                odd = tmp;
            }
            else
            {
                even.next = tmp;
                even = tmp;
            }
            tmp = tmp.next;
            i++;

        }

        odd.next = evenhead.next;
        even.next = null;
        return oddhead.next;
        
    }
}