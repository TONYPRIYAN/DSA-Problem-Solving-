class Solution {
    public int sumFourDivisors(int[] nums) 
    {
        int totsum = 0;

        for(int x : nums)
        {
            int cnt = 0;
            int sum = 0;
            for(int i=1;i<=x;i++)
            {
                if(cnt > 4) break;
                if(x % i == 0)
                {
                    sum+=i;
                    cnt++;
                }

            }
            if(cnt == 4)
            {
                totsum += sum;
            }

        }

        return totsum;
        
    }
}