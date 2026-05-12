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
        traverse(root,0,list);
        return list;
    }

    public void traverse(TreeNode node,int lvl,List<Integer> list)
    {

        if(node == null) return;

        if(lvl == list.size()) list.add(node.val);

        traverse(node.right,lvl+1,list);
        traverse(node.left,lvl+1,list);

    }


}