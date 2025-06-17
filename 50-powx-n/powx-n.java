class Solution {
    public double myPow(double x, int n) 
    {
        if(n == 0) return 1;


        long exp = n;
        if(exp < 0)
        {
            x = 1/x;
            exp = -exp;
        }


        double half = myPow(x,(int)(exp/2));

        // if(exp %2 == 0)
        // {
        //     return ;
        // }
        // else
        // {
        //     return x * half * half;
        // }

        return exp%2 == 0 ? half * half : x*half * half;
        
    }
}