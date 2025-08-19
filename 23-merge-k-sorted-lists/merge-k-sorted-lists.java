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
    public ListNode mergeKLists(ListNode[] lists) 
    {
        PriorityQueue<ListNode> pq = new PriorityQueue<>((a,b) -> a.val - b.val);

        for(ListNode head : lists)
        {
            if(head != null)
                pq.add(head);
        }

        ListNode list2 = new ListNode(0);
        ListNode tmp = list2;

        while(!pq.isEmpty())
        {
            ListNode top = pq.poll();
            tmp.next = top;
            tmp = top;

            if(top.next != null)
            {
                pq.add(top.next);
            }
        }

        return list2.next;
        
    }
}