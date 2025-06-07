/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    Stack<Integer> st = new Stack<>();
    boolean flag = true;
    public boolean isValidBST(TreeNode root) 
    {
        traverse(root);
        return flag;
    }

    public void traverse(TreeNode root)
    {
        if(root == null) return;
        traverse(root.left);
        if(st.isEmpty()) st.push(root.val);
        else if(st.peek() >= root.val){
            flag = false;
            return;
        }
        else
        {
            st.push(root.val);
        }
        traverse(root.right);


    }
}