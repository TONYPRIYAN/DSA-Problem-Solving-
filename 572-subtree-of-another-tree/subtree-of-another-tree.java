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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) 
    {
        StringBuilder str1 = new StringBuilder();
        StringBuilder str2 = new StringBuilder();

        traverse(root,str1);
        traverse(subRoot,str2);

        return str1.toString().contains(str2.toString());


        
    }

    public void traverse(TreeNode root,StringBuilder sb)
    {
        if(root == null)
        {
            sb.append("#,");
            return;
        }

        sb.append("x").append(root.val).append(",");
        traverse(root.left,sb);
        traverse(root.right,sb);
    }
}