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
    public int pairSum(ListNode head) 
    {
        ListNode mid = null;

        ListNode s = head;
        ListNode f = head;

        while(f != null && f.next != null)
        {
            f = f.next.next;
            s = s.next;
        }

         ListNode tmp = s;
        ListNode nxt = null;;
        ListNode prev = null;

        while(tmp != null)
        {
            
                nxt = tmp.next;
                tmp.next = prev;
                prev = tmp;
                tmp = nxt;
        }


        tmp = head;
        int max = Integer.MIN_VALUE;
        while(prev != null && tmp != null)
        {
            max = Math.max(max,prev.val + tmp.val);
            prev = prev.next;
            tmp = tmp.next;
        }
        
        return max;
    }
}