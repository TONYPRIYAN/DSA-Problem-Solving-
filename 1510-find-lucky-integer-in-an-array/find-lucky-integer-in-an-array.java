class Solution {
    public int findLucky(int[] arr) 
    {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int x : arr)
        {
            map.put(x,map.getOrDefault(x,0)+1);
        }

        int max = -1;
        for(int x : map.keySet())
        {
            if(x == map.get(x))
            max = Math.max(max,x);
        }

        return max;
        
        
    }
}