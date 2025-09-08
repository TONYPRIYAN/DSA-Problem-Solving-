class Solution {
    public int[] getNoZeroIntegers(int n)
    {
        // double n = m;
        // return new int[]{(int)Math.ceil(n/2),(int)Math.floor(n/2)};
        for(int i = 1;i <= n/2;i++)
        {
            if(isZero(i) && isZero(n-i))
            {
                return new int[]{i,n-i};
            }
        }
        return new int[]{-1,-1};

    }

    public boolean isZero(int n)
    {
        while(n>0)
        {
            if(n%10 == 0)
                return false;
            n = n/10;
        }

        return true;
    }
}