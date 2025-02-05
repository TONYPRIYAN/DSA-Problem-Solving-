class Solution {
    public int findKthPositive(int[] arr, int k) 
    {
        
        int count = 0;
        int m = 0;
        int i = 1;

        while(count < k)
        {
            if( m < arr.length && i == arr[m])
            {
                m++;
            }
            else
            {
                count++;
                if(count == k)
                {
                    return i;
                }
                
            }
            i++;

        }

        return -1;
        
    }
}