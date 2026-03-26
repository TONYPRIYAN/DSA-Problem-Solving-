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
    public boolean isValidBST(TreeNode root) 
    {
        ArrayList<Integer> list = new ArrayList<>();

        traverse(root,list);

        for(int i=1;i<list.size();i++)
        {
            if(list.get(i) <= list.get(i-1))
            {
                return false;
            }
        }

        return true;
    }


    public void traverse(TreeNode root,ArrayList<Integer> list)
    {
        if(root == null) return;

        traverse(root.left,list);
        list.add(root.val);
        traverse(root.right,list);
    }


}