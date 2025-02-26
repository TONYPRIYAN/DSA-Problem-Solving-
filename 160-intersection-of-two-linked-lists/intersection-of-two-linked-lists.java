/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) 
    {
        ListNode Aptr = headA;
        ListNode Bptr = headB;

        HashMap<ListNode,Integer> intersect = new HashMap<>();

        
        while(Aptr != null)
        {
            intersect.put(Aptr,1);
            Aptr = Aptr.next;
        }

        while(Bptr != null)
        {
            if(intersect.containsKey(Bptr))
            {
                return Bptr;
            }
            Bptr = Bptr.next;
        }

        return null;
        
    }
}