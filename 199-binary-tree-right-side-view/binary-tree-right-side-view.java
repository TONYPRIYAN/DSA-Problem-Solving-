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
    public List<Integer> rightSideView(TreeNode root) 
    {

        List<Integer> list = new ArrayList<>();
        traverse(list,0,root);
        return list;
        
    }

    public void traverse(List<Integer> list,int lvl,TreeNode root)
    {
        if(root == null)
        {
            return;
        }
        if(lvl == list.size())
        {
            list.add(root.val);
        }

        traverse(list,lvl+1,root.right);
        traverse(list,lvl+1,root.left);

    }
}