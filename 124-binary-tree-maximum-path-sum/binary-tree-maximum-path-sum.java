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
    
    public int maxPathSum(TreeNode root) 
    {
        int[] maxsum = new int[1];
        maxsum[0] =  Integer.MIN_VALUE;
        traverse(root,maxsum);

        return maxsum[0];
    }

    public int traverse(TreeNode node,int[] maxsum)
    {
        if(node == null) return 0;

        int left = Math.max(0,traverse(node.left,maxsum));
        int right = Math.max(0,traverse(node.right,maxsum));

        maxsum[0] = Math.max(maxsum[0],left+right+node.val);

        return Math.max(left,right)+node.val;
    }
}