/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public int maxDepth(Node root) 
    {
      return traverse(root);  
    }

    public int traverse(Node node)
    {
        if(node == null)
            return 0;
        int max = 0;
        for(Node n : node.children)
        {
            max = Math.max(max,traverse(n));
        }

        return 1+ max;

    }
}