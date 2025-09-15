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
    int num = 0;
    int i;
    public int kthSmallest(TreeNode root, int k) 
    {
        
        i = k;
        inorder(root);

        

        return num;
        
    }

    public void inorder(TreeNode root)
    {
        if(root == null)
            return;

        inorder(root.left);
        i--;
        if(i==0)
        {
            num = root.val;
            return;
        }
        inorder(root.right);
    }


}