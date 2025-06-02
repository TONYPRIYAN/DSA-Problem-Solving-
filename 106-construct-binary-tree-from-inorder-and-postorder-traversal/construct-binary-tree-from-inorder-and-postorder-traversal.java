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
    int postord = 0;
    HashMap<Integer,Integer> map  = new HashMap<>();
    public TreeNode buildTree(int[] inorder, int[] postorder) 
    {

        for(int i=0;i<inorder.length;i++)
        {
            map.put(inorder[i],i);
        }

        postord = postorder.length-1;
        
        return build(postorder,0,inorder.length-1);
    }

    public TreeNode build(int[] postorder,int start,int end)
    {
        if(start > end) return null;

        int rootval = postorder[postord--];

        TreeNode root = new TreeNode(rootval);

        int mid = map.get(rootval);

        root.right = build(postorder,mid+1,end);
        root.left = build(postorder,start,mid-1);
        

        return root;
    }
}