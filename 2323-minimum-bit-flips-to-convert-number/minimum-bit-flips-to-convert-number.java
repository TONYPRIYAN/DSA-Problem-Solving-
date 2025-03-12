class Solution {
    public int minBitFlips(int start, int goal) 
    {
        if(start == goal)
        {
            return 0;
        }
        int n = start ^ goal;

        int c = 0;
        while(n>0)
        {
            c += (n&1);
            n = n>>1;
        }

        return c;
        
    }
}