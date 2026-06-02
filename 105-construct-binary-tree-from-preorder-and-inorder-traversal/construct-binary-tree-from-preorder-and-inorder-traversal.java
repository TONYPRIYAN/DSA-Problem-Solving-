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
    HashMap<Integer,Integer> map = new HashMap<>();
    int k=0;
    public TreeNode buildTree(int[] preorder, int[] inorder) 
    {
        if(preorder == null || inorder == null)
        {
            return null;
        }

        for(int i=0;i<inorder.length;i++)
        {
            map.put(inorder[i],i);
        }

        return build(preorder,0,preorder.length-1);
    }


    public TreeNode build(int[] preorder,int start,int end)
    {
        if(start > end) return null;

        int val =  preorder[k++];

        TreeNode root = new TreeNode(val);

        int mid = map.get(val);

        root.left = build(preorder,start,mid-1);
        root.right = build(preorder,mid+1,end);


        return root;



    }
}
