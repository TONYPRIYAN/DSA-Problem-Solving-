/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) 
    {
        HashMap<ListNode,Integer> map = new HashMap<>();

        ListNode tmp = head;

        while(tmp != null)
        {
            if(map.containsKey(tmp))
            {
                return tmp;
            }
            
                map.put(tmp,tmp.val);
                tmp = tmp.next;

        }

        return null;
        
    }
}