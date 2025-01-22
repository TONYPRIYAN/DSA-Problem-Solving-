class Solution {

    double hours(int mid,int[] piles)
    {
        double tot = 0;

        for(int x : piles)
        {
            tot += Math.ceil((double) x/mid);
        }
        return tot;

    }

    public int minEatingSpeed(int[] piles, int h) 
    {
        int arr[] = Arrays.copyOf(piles,piles.length);
        Arrays.sort(arr);

        int max = arr[arr.length-1];

        int l = 1;
        int r = max;
        int ans = max;

        while(l<=r)
        {
            int mid = (l+r)/2;
            double hrs = hours(mid,piles);
            if(hrs <= h)
            {
                ans = mid;
                r = mid-1;

            }
            else
            {
                l = mid+1;
            }
        }
        return ans;
    }
}