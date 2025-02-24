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
class Solution 
{
    public ListNode reverse(ListNode slow)
    {

        
        ListNode current = slow;
        ListNode prev = null;

        while(current != null)
        {
            ListNode tmp = current.next;
            current.next = prev;
            prev = current;
            current = tmp;

            
        }

        return prev;



    }



    public boolean isPalindrome(ListNode head) 
    {

        ListNode s = head;
        ListNode f = head;

        if(head == null || head.next == null)
        {
            return true;
        }

        while(f != null && f.next != null)
        {
            s = s.next;
            f = f.next.next;
        }

        s= reverse(s);
        
        ListNode s1 = head;

        

        while(s != null)
        {
            if(s1.val != s.val)
            {
                return false;
            }
            s1 = s1.next;
            s = s.next;
            
        }
        return true;
    }
}