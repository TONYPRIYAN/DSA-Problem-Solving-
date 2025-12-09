class Solution {
    public int countOdds(int low, int high) 
    {
        int i = 0;

        i = low%2 == 0? low + 1 : low;

        int cnt = 0;

        while(i <= high)
        {
            cnt++;
            i += 2;
        }

        return cnt;
        
    }
}