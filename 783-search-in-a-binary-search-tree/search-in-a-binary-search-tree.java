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
    public TreeNode searchBST(TreeNode root, int val) 
    {

        return dfs(root,val);
    }

    public TreeNode dfs(TreeNode node,int val)
    {
        if(node == null) return node;

        if(node.val == val)
        {
            return node;
        }
        else
        {
            return val < node.val ? dfs(node.left,val) : dfs(node.right,val);
        }
    }
}