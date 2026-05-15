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

    class Pair
    {
        TreeNode node;
        int vertical;
        int lvl;

        Pair(TreeNode node,int vertical,int lvl)
        {
            this.node = node;
            this.vertical = vertical;
            this.lvl = lvl;
        }
    }

    public List<List<Integer>> verticalTraversal(TreeNode root) 
    {
        TreeMap<Integer,TreeMap<Integer,PriorityQueue<Integer>>> nodes = new TreeMap<>();

        Queue<Pair> todo = new LinkedList<>();

        todo.offer(new Pair(root,0,0));

        while(!todo.isEmpty())
        {
            Pair p = todo.poll();
            TreeNode temp = p.node;
            int x = p.vertical;
            int y = p.lvl;

            nodes.putIfAbsent(x,new TreeMap<>());
            nodes.get(x).putIfAbsent(y, new PriorityQueue<>());
            nodes.get(x).get(y).offer(temp.val);

            if(temp.left !=  null)
            {
                todo.offer(new Pair(temp.left,x-1,y+1));
            }

            if(temp.right != null)
            {
                todo.offer(new Pair(temp.right,x+1,y+1));
            }
        }

            List<List<Integer>> arr = new ArrayList<>();

            for(TreeMap<Integer,PriorityQueue<Integer>> ys : nodes.values())
            {
                List<Integer> col = new ArrayList<>();
                for(PriorityQueue<Integer> pq : ys.values())
                {
                    while(!pq.isEmpty())
                    col.add(pq.poll());
                }
                arr.add(col);

            }


        
                    return arr;

        
    }
}