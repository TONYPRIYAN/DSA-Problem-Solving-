class Solution {
    public int smallestNumber(int n) 
    {
        if(n == 1) return 1;
        int k = 0;
        int num = 2;
        while(! (Math.pow(num,k) > n))
        {
            k++;
        }

        return (int)Math.pow(num,k)-1;
        
    }
}