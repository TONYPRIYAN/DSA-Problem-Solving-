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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) 
    {
        List<List<Integer>> arr = new ArrayList<>();
        dfs(root,arr,new ArrayList(),targetSum);
        return arr;
    }

    public void dfs(TreeNode root,List<List<Integer>> arr,List<Integer> path,int sum)
    {
        if(root == null) return;

        path.add(root.val);
        if(root.left == null && root.right == null && root.val == sum)
        {
            arr.add(new ArrayList<>(path));
        }
        else
        {
            dfs(root.left,arr,path,sum-root.val);
            dfs(root.right,arr,path,sum-root.val);
        }

        path.remove(path.size()-1);
    }
}