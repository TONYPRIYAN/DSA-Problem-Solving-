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

    List<Integer> arr = new ArrayList<>();
    public List<Integer> rightSideView(TreeNode root) 
    {
        traverse(root,0);
        return arr;
        
    }

    public void traverse(TreeNode root,int lvl)
    {
        if(root == null)
            return;

        if(lvl == arr.size())
        {
            arr.add(root.val);
        }

        traverse(root.right,lvl + 1);
        traverse(root.left,lvl + 1);

    }
}