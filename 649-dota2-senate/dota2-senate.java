class Solution {
    public String predictPartyVictory(String senate) 
    {
        Queue<Character> q = new LinkedList<>();

        for(char c : senate.toCharArray())
        {
            q.offer(c);
        }

        int ban = 0;

        while(q.size() > Math.abs(ban))
        {
            if(ban < 0 && q.peek() == 'R')
            {
                q.poll();
                ban++;
            }
            else if(ban > 0 && q.peek() == 'D')
            {
                q.poll();
                ban--;
            }
            else
            {
                ban += q.peek() == 'R'?1:-1;
                q.offer(q.poll());
            }

        }

        return ban > 0?"Radiant" : "Dire";
        
    }
}