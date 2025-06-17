class Solution {
    public int mySqrt(int x) 
    {
        // int l = 1;
        // int r = x;

        // while(l <= r)
        // {
        //     long mid = l + (r-l)/2;

        //     if(mid*mid == x)
        //     return (int)mid;

        //     else if(mid*mid > x)
        //     r = (int)mid-1;

        //     else
        //     l = (int)mid+1;
        // }
        // return r;

        long n = x;

        while(n * n > x)
        {
            n = (n + (x/n))/2;
        }

        return (int)n;
        
    }
}