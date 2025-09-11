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

    Integer prev;
    boolean flag = true;

    public boolean isValidBST(TreeNode root) {
        traverse(root);
        return flag;
    }

    public void traverse(TreeNode node) {
        if (node == null)
            return;

        traverse(node.left);
        if (prev == null)
            prev = node.val;
        else if (prev >= node.val) {
            flag = false;
            return;
        } else
            prev = node.val;

        traverse(node.right);
    }
}