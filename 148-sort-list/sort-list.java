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

    public static ListNode middle(ListNode head)
    {
         if (head == null || head.next == null) {
        return head;
    }
        ListNode f = head.next;
        ListNode s = head;

        while(f != null && f.next != null)
        {
            s = s.next;
            f = f.next.next;
        }

        return s;

    }

    public static ListNode merge(ListNode l1,ListNode l2)
    {
        ListNode dummyhead = new ListNode(-1);
        ListNode tmp  = dummyhead;

        while(l1 != null && l2 != null)
        {
            if(l1.val <= l2.val)
            {
                tmp.next = l1;
                l1 = l1.next;
            }
            else
            {
                tmp.next = l2;
                l2 = l2.next;
            }

            tmp = tmp.next;
        }

        if(l1 != null)
        {
            tmp.next = l1;
        }
        else
        {
            tmp.next = l2;
        }

        return dummyhead.next;



    }



    public ListNode sortList(ListNode head) 
    {

        if(head == null || head.next == null)
        {
            return head;
        }

        ListNode mid = middle(head);

        ListNode lefthead = head;
        ListNode righthead = mid.next;
        mid.next = null;

        lefthead = sortList(lefthead);
        righthead = sortList(righthead);




        

        return merge(lefthead,righthead);




        
        
    }
}