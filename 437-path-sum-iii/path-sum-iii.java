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
    public int pathSum(TreeNode root, int targetSum) 
    {
        if(root == null) return 0;
        return dfs(root,targetSum)+pathSum(root.left,targetSum)+pathSum(root.right,targetSum);

    }

    public int dfs(TreeNode root,long sum)
    {
        if(root == null) return 0;

        int c = 0;
        if(root.val == sum) c++;
        c += dfs(root.left,sum-root.val);
        c += dfs(root.right,sum-root.val);

        return c;

    }
}