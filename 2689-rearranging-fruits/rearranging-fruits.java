class Solution {
    public long minCost(int[] basket1, int[] basket2) 
    {
        TreeMap<Integer,Integer> map = new TreeMap<>();

        for(int i : basket1)
        {
            map.merge(i,1,Integer::sum);
        }
         for(int i : basket2)
        {
            map.merge(i,-1,Integer::sum);
        }
        List<Integer> list = new ArrayList<>();

        long res = 0;
        long small = map.firstKey();

        for(int i : map.keySet())
        {
            if(map.get(i)%2 > 0)
            return -1;

            int num = Math.abs(map.get(i)) / 2;
            for(int j=0;j<num;++j)
            {
                list.add(i);
            }
        }

        for(int i=0;i<list.size()/2;++i)
        {
            res += Math.min(list.get(i),small *2);
        }

        return res;
        
    }
}