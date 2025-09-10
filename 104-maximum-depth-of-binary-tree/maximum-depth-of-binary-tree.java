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
        // OPTIMISED

        public int maxDepth(TreeNode root)
        {
            if(root == null)
                return 0;
            
            return 1 + Math.max(maxDepth(root.left),maxDepth(root.right));
        }

    // public int maxDepth(TreeNode root) 
    // {

    //     return traverse(root);
        
    // }

    // public int traverse(TreeNode root)
    // {
    //     if(root == null)
    //     {
    //         return 0;
    //     }

    //     int left = traverse(root.left);
    //     int right = traverse(root.right);

    //     return 1 + Math.max(right,left);
    // }
}