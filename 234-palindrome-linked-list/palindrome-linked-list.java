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
    public boolean isPalindrome(ListNode head) 
    {

        ListNode tmp = head;
        String num = "";

        while(tmp != null)
        {
            num +=  tmp.val;
            tmp = tmp.next;

        }

        StringBuilder str2  =  new StringBuilder();

        str2.append(num);
        str2.reverse();

        return num.equals(str2.toString());
       
        
    }
}