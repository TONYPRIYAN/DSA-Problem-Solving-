class Solution {
    public int findKthLargest(int[] nums, int k) 
    {
        PriorityQueue<Integer> queue = new PriorityQueue<>((a,b) -> b - a);

        for(int x : nums)
        {
            queue.add(x);
        }
        int num = 0;
        for(int i=1;i<=k;i++)
        {
            num = queue.poll();
        }
        
        return num;
    }
}