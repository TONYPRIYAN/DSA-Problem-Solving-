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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) 
    {
        if(list1 == null && list2 == null) return list1;

        if(list1 != null && list2 == null) return list1;

        if(list1 == null && list2 != null) return list2;

        ListNode head = new ListNode(-1);
        ListNode tmp = head;
        ListNode tmp1 = list1;
        ListNode tmp2 = list2;

        while(tmp1 != null && tmp2 != null)
        {
            if(tmp1.val <= tmp2.val)
            {
                ListNode newNode = new ListNode(tmp1.val);
                tmp.next = newNode;
                tmp = newNode;
                tmp1 = tmp1.next;
            }
            else
            {
                ListNode newNode = new ListNode(tmp2.val);
                tmp.next = newNode;
                tmp = newNode;
                tmp2 = tmp2.next;
            }
        }

        while(tmp1 != null)
        {
                ListNode newNode = new ListNode(tmp1.val);
                tmp.next = newNode;
                tmp = newNode;
                tmp1 = tmp1.next;
        }

        while(tmp2 != null)
        {
                ListNode newNode = new ListNode(tmp2.val);
                tmp.next = newNode;
                tmp = newNode;
                tmp2 = tmp2.next;
        }

        return head.next;

        
    }
}