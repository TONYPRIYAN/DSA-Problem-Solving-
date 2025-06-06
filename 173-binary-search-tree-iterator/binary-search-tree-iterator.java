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
class BSTIterator 
{
    Stack<TreeNode> st = new Stack<>();
    public BSTIterator(TreeNode root) 
    {
        while(root != null)
        {
            st.push(root);
            root = root.left;
        }
    }
    
    public int next() 
    {
        TreeNode res = st.pop();
        TreeNode cur = res.right;

        while(cur!=null)
        {
            st.push(cur);
            cur = cur.left;
        }
        return res.val;
    }
    
    public boolean hasNext() 
    {
        return !st.isEmpty();
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */