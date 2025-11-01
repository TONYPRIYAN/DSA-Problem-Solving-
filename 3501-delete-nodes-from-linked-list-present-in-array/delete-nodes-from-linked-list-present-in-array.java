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
    public ListNode modifiedList(int[] nums, ListNode head) {

        Set set = new HashSet<>();
        ListNode list = new ListNode(-1);
        list.next = head;

        ListNode prev = list;
        ListNode tmp = head;


        for (int x : nums) {
            set.add(x);
        }

        while(tmp != null)
        {
            if(set.contains(tmp.val))
            {
                prev.next = tmp.next;
            }
            else
            {
                prev = tmp;
            }

            tmp = tmp.next;
        }


        return list.next;
        

    }
}