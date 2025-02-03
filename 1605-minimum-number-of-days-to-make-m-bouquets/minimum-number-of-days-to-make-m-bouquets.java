class Solution {
    public int minDays(int[] bloomDay, int m, int k) 
    {
     
    if( (long) m*k> bloomDay.length)
    {
        return -1;
    }
    

   
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;


        for(int i = 0;i<bloomDay.length;i++)
        {
          min = Math.min(min, bloomDay[i]);
          max = Math.max(max, bloomDay[i]);

        }

        int left = min;
        int right = max;


        while(left < right)
        {
            int mid = left + (right-left) / 2;

            int pos = validate(bloomDay,mid,m,k);

            if(pos < m)
            {
                left = mid +1;
                
            }
            else
            {
                right = mid;
            }

        }

       return left;
    }

    public int validate(int bloomDay[],int mid,int m,int k)
    {
        int count = 0;
        int bouq = 0;

        for(int bloom : bloomDay)
        {
            if(bloom <= mid)
            {
                count++;
                if(count == k)
                {
                    bouq++;
                    count = 0;
                }
            }
            else
            {
                count = 0;
            }
        

    
    }
    return bouq;
   
    }
}
