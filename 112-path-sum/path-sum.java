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
    public boolean hasPathSum(TreeNode root, int targetSum) 
    {

        return traverse(root,targetSum);
        
    }

    public boolean traverse(TreeNode root,int target)
    {
        if(root == null) return false;

        if(root.left == null && root.right == null)
        {
            return root.val == target;
        }
        
        return traverse(root.left,target-root.val) || traverse(root.right,target-root.val);


    }
}