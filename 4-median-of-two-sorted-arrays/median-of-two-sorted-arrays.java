class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) 
    {
        int m = nums1.length;
        int n = nums2.length;

        int tot = m+n;

        int mi = tot/2;
        int ni = mi-1;

        int me = -1;
        int ne = -1;

        int i=0;
        int j=0;
        int cnt = 0;


        while(i < m && j < n)
        {
            if(nums1[i] < nums2[j])
            {
                if(mi == cnt) me = nums1[i];
                if(ni == cnt) ne = nums1[i];
                i++;
                cnt++;
            }
            else
            {
                if(mi == cnt) me = nums2[j];
                if(ni == cnt) ne = nums2[j];
                j++;
                cnt++;

            }
        }

        while(i < m)
        {
            if(mi == cnt) me = nums1[i];
            if(ni == cnt) ne = nums1[i];
            i++;
            cnt++;
        }

        while(j < n)
        {
            if(mi == cnt) me = nums2[j];
            if(ni == cnt) ne = nums2[j];
            j++;
            cnt++;
        }

        if(tot % 2 == 1)
        {
            return (double)me;
        }
        else
        {
            return (double)((me+ne)/2.0);
        }


        
    }
}