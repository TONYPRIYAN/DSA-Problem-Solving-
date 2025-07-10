class Solution {
    public int largestAltitude(int[] gain) 
    {
        int alt = 0;
        int max = alt;
        for(int x : gain)
        {
            alt += x;
            max = Math.max(max,alt);
        }

        return max;
        
    }
}