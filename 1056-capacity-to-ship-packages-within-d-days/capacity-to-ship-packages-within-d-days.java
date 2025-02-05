class Solution 
{
    boolean check(int[] weights,int days,int i)
    {
        int rdays = 1;
            int load = 0;

            for(int x : weights)
            {
                if(load+x > i)
                {
                    rdays++;
                    load = 0;
                }
                load += x;
            }

            if(rdays <= days)
            {
                return true;
            }

            return false;


    }


    public int shipWithinDays(int[] weights, int days)
    {
        int low = 0;
        int high = 0;

        for(int x : weights)
        {
            low = Math.max(low,x);
            high+=x;

        }

        while(low <= high)
        {
            int mid = low+(high-low)/2;

            if(check(weights,days,mid))
            {
                high = mid-1;
            }
            else
            {
                low = mid + 1;
            }



        }

        return low;

        
        
    }
}