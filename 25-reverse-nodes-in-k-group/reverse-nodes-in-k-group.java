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

    public static ListNode KNode(ListNode tmp,int k)
    {

        k-=1;

        while(tmp != null && k>0)
        {
            k--;
            tmp = tmp.next;
        }

    return tmp;


    }
     public static ListNode Reverse(ListNode head)
        {
            
            ListNode prev = null;
            ListNode current = head;

            while(current != null)
            {
                ListNode tmp = current.next;
                current.next = prev;
                prev = current;
                current = tmp;

            }

            return prev;

        }
    public ListNode reverseKGroup(ListNode head, int k) 
    {
        ListNode tmp = head;

        ListNode prevLast = null;

        while(tmp != null)
        {

        

        ListNode knode = KNode(tmp,k);

        if(knode == null)
        {
            if(prevLast != null)
            {
                prevLast.next = tmp;
            }
            break;
        }

        ListNode newnode = knode.next;
        knode.next = null;

        Reverse(tmp);

        if(tmp == head)
        {
            head = knode;
        }
        else
        {
            prevLast.next = knode;
        }

        prevLast = tmp;

        tmp = newnode;

        }

        return head;
       
        
    }
}