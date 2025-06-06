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
    List<Integer> ele = new ArrayList<>();
    public List<Integer> postorderTraversal(TreeNode root) 
    {
        postorder(root);
        return ele;

        
    }

    public void postorder(TreeNode root)
    {


        if(root == null) return;

        postorder(root.left);
        postorder(root.right);
        ele.add(root.val);

    }
}