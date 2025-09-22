class Solution {
    public int leastInterval(char[] tasks, int n) 
    {
        int op = 0;

        Map<Character,Integer> map = new HashMap<>();

        for(char c : tasks)
        {
            map.put(c,map.getOrDefault(c,0)+1);
        }

        PriorityQueue<Map.Entry<Character,Integer>> q = new PriorityQueue<>(
            (a,b) -> a.getValue() != b.getValue() ? b.getValue() - a.getValue() : a.getKey() - b.getKey());
        

        q.addAll(map.entrySet());

        while(!q.isEmpty())
        {
            List<Map.Entry> tmp = new ArrayList<>();
            int k = n+1;

            while(k > 0 && !q.isEmpty())
            {
                Map.Entry<Character,Integer> top = q.poll();
                top.setValue(top.getValue() - 1);
                tmp.add(top);
                k--;
                op++;
            }

            for(Map.Entry<Character,Integer> e : tmp)
            {
                if(e.getValue() > 0)
                {
                    q.add(e);
                }
            }

            if(q.isEmpty())
            {
                break;
            }

            op += k;
        }

        return op;
        
    }
}