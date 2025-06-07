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
    Integer prev = null;
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
        if(prev == null) prev = root.val;
        else if(prev >= root.val){
            flag = false;
            return;
        }
        else
        {
            prev = root.val;
        }
        traverse(root.right);


    }
}