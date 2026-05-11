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
    public List<Integer> postorderTraversal(TreeNode root) 
    {

        List<Integer> list = new ArrayList<>();

        Stack<TreeNode> st = new Stack<>();

        if(root == null) return list;
        st.push(root);

        while(!st.isEmpty())
        {
         TreeNode node = st.pop();
         list.add(node.val);
         if(node.left != null)
         {
            st.push(node.left);
         }

          if(node.right != null)
         {
            st.push(node.right);
         }
        }

        Collections.reverse(list);

        return list;
        
    }
}