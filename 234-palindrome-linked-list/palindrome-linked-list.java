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

        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }

        slow = reverse(slow);

        ListNode tmp = head;

        while(slow != null)
        {
            if(slow.val != tmp.val)
            {
                return false;
            }
            slow = slow.next;
            tmp = tmp.next;
        }

        return true;
        
    }
}