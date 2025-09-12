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
    public List<List<Integer>> levelOrder(TreeNode root) 
    {
        List<List<Integer>> arr = new ArrayList<>();

        Queue<TreeNode> queue = new LinkedList<>();

        if(root == null)
            return arr;

        queue.offer(root);
        while(!queue.isEmpty())
        {
            List<Integer> arr2 = new ArrayList<>();

            int n = queue.size();

            for(int i=1;i<=n;i++)
            {
            if(queue.peek().left != null)   queue.offer(queue.peek().left);
            if(queue.peek().right != null)   queue.offer(queue.peek().right);
            
            arr2.add(queue.poll().val);
            }

            arr.add(arr2);


        }
        return arr;
        
    }
}