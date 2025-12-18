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
        if(head == null || head.next == null) return head;

        ListNode tmp = head;
        int n = 1;

        while(tmp.next != null)
        {
            n++;
            tmp = tmp.next;
        }

        tmp.next = head;
        k = k%n;

        ListNode tmp2 = head;

        for(int i=1;i<n-k;i++)
        {
            tmp2 = tmp2.next;
            
        }

        head = tmp2.next;
        tmp2.next = null;

        return head;

    }
}