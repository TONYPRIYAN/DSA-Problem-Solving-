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
    public int minDepth(TreeNode root) 
    {
        return traverse(root);
        
    }

    public int traverse(TreeNode node)
    {
        if(node == null) return 0;
        int left = traverse(node.left);
        int right = traverse(node.right);

        return (left == 0 || right == 0) ? left + right + 1 : Math.min(left,right) + 1;
    }
}