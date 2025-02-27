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
        if(list1 == null && list2 == null)
        {
            return null;
        }

        if(list1 == null && list2 != null)
        {
            return list2;
        }

        if(list1 != null && list2 == null)
        {
            return list1;
        }

        ListNode list3 = new ListNode(0);

        ListNode listhead = list3;

        ListNode tmp1 = list1;
        ListNode tmp2 = list2;

        while(tmp1 != null && tmp2 != null)
        {
            if(tmp1.val < tmp2.val)
            {
                ListNode tmp = new ListNode(tmp1.val);
                list3.next = tmp;
                list3 = tmp;
                tmp1 = tmp1.next;
            }
            else
            {
                ListNode tmp = new ListNode(tmp2.val);
                list3.next = tmp;
                list3 = tmp;
                tmp2 = tmp2.next;

            }
        }

        while(tmp1 != null)
        {
                ListNode tmp = new ListNode(tmp1.val);
                list3.next = tmp;
                list3 = tmp;
                tmp1 = tmp1.next;
        }

        while(tmp2 != null)
        {
                ListNode tmp = new ListNode(tmp2.val);
                list3.next = tmp;
                list3 = tmp;
                tmp2 = tmp2.next;
        }


        return listhead.next;
    }
}