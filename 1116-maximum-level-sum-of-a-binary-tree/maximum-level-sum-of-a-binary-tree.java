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
    public int maxLevelSum(TreeNode root) 
    {
        int maxSum =Integer.MIN_VALUE;
        int lvl= 0;
        List<Integer> arr = new ArrayList<>();

        dfs(root,0,arr);

        for(int i=0;i<arr.size();i++)
        {
            if(arr.get(i) > maxSum)
            {
                maxSum = arr.get(i);
                lvl = i+1;
            }
        }

        System.out.println(maxSum);
        return lvl;
        
    }

    public void dfs(TreeNode node,int lvl,List<Integer> arr)
    {
        if(node == null) return;

        if(lvl == arr.size())
        {
            arr.add(node.val);
        }
        else
        {
            arr.set(lvl,arr.get(lvl)+node.val);
        }

        dfs(node.left,lvl+1,arr);
        dfs(node.right,lvl+1,arr);
    }
}