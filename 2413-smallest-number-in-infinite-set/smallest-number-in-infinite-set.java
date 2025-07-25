class SmallestInfiniteSet {
    PriorityQueue<Integer> queue;
    Integer min;


    public SmallestInfiniteSet() {

        min = 1;
        queue = new PriorityQueue<>();
    }
    
    public int popSmallest() 
    {
        if(!queue.isEmpty())
             return queue.poll();
        min++;
        return min-1;
    }
    
    public void addBack(int num) 
    {
        if(min > num && !queue.contains(num))
        queue.offer(num);
    }
}

/**
 * Your SmallestInfiniteSet object will be instantiated and called as such:
 * SmallestInfiniteSet obj = new SmallestInfiniteSet();
 * int param_1 = obj.popSmallest();
 * obj.addBack(num);
 */