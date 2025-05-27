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
    
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) 
    {
        ListNode l3 = new ListNode(0);
        ListNode l3head = l3;
        int carry = 0;
        
        while(l1 != null || l2 != null)
        {
         int sum = carry;
         if(l1 != null) sum += l1.val;
         if(l2 != null) sum += l2.val;

         ListNode newnode = new ListNode(sum %10);
         carry = sum/10;
         l3.next = newnode;
         l3 = newnode;


         if(l1 != null) l1 = l1.next;
         if(l2 != null) l2 = l2.next;

        }

        if(carry != 0)
        {
            ListNode newnode = new ListNode(carry);
             l3.next = newnode;
            l3 = newnode;
        }

        return l3head.next;

    }
}