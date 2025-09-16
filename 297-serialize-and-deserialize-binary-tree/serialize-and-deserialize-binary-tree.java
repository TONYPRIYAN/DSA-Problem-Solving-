/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) 
    {
        if(root == null)
            return "";

        StringBuilder sb = new StringBuilder();
        Queue<TreeNode> queue = new LinkedList<>();

        queue.add(root);

        while(!queue.isEmpty())
        {
            TreeNode node = queue.poll();

            if(node == null)
                sb.append("#").append(",");
            else
            {
                sb.append(node.val).append(",");
                queue.offer(node.left);
                queue.offer(node.right);
            }
                
        }


        return sb.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) 
    {
        if(data == null || data.isEmpty()) return null;

        String[] nodes = data.split(",");
        int i = 0;

        TreeNode root = new TreeNode(Integer.parseInt(nodes[i++]));
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty() && i < nodes.length)
        {
            TreeNode node = queue.poll();

            String leftchild = nodes[i++];
            if(!leftchild.equals("#"))
            {
                node.left = new TreeNode(Integer.parseInt(leftchild));
                queue.offer(node.left);
            }

            if(i < nodes.length)
            {
                String rightchild = nodes[i++];
                 if(!rightchild.equals("#"))
            {
                node.right = new TreeNode(Integer.parseInt(rightchild));
                queue.offer(node.right);
            }
            }
        }

        return root;



        
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));