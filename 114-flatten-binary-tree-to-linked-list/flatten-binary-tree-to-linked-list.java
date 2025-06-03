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
   public void flatten(TreeNode root) {
    traverse(root);
}

public TreeNode traverse(TreeNode root) {
    if (root == null) return null;

    TreeNode leftLast = traverse(root.left);
    TreeNode rightLast = traverse(root.right);

    if (root.left != null) {
        //if (leftLast != null) {
            leftLast.right = root.right;
        //}
        root.right = root.left;
        root.left = null;
    }

    if (rightLast != null) return rightLast;
    if (leftLast != null) return leftLast;
    return root;
}

}