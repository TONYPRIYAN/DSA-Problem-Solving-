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
    int preord = 0;
    HashMap<Integer,Integer> map = new HashMap<>();
    public TreeNode buildTree(int[] preorder, int[] inorder) 
    {
        if(preorder == null || inorder == null) return null;
        
       for(int i=0;i<inorder.length;i++)
       {
        map.put(inorder[i],i);
       }

        return build(preorder,0,inorder.length-1);

        
    }

    public TreeNode build(int[] preorder,int start,int end)
    {

        if(start > end) return null;
        
        int rootval = preorder[preord++];
        TreeNode root = new TreeNode(rootval);

        int mid = map.get(rootval);

        root.left = build(preorder,start,mid-1);
        root.right = build(preorder,mid+1,end);

        return root;
    }

    
}