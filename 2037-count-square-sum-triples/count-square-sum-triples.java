class Solution {
    public int countTriples(int n) 
    {

        int cnt = 0;

        for(int i=1;i<n;i++)
        {
            for(int j=i+1;j<=n;j++)
            {
                int sum = i*i + j*j;
                int rt = (int) Math.sqrt(sum);
                if( rt*rt == sum && rt <= n)
                {
                    cnt += 2;
                }
            }
        }

        return cnt;
        
    }
}