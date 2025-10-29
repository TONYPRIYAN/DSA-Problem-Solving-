class Solution {
    public int smallestNumber(int n) 
    {
      if(n <= 1) return n;

      int pow = 1;
      while(pow > 0 && pow <= n)
      {
        pow <<= 1;
      }

      if(pow <= 0) return Integer.MAX_VALUE;

      return pow-1;
        
    }
}