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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) 
    {
        List<List<Integer>> arr = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        boolean ltr = true;

        if(root == null) return arr;

        queue.offer(root);

        while(!queue.isEmpty())
        {
            List<Integer> arr2 = new LinkedList<>();
            int lvl = queue.size();
            
            for(int i = 0;i<lvl;i++)
            {
                TreeNode node = queue.poll();
                if(ltr)
                {
                    arr2.addLast(node.val);
                }
                else
                {
                    arr2.addFirst(node.val);
                }

                if(node.left != null) queue.offer(node.left);
                if(node.right != null) queue.offer(node.right);
                
                
            }

            arr.add(arr2);
            ltr = !ltr;
        }

        return arr;
        
    }
}