class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) 
    {
        int m = nums1.length;
        int n = nums2.length;

        int tot = m+n;

        int mi = tot / 2;
        int ni = mi - 1;

        

        int me = -1;
        int ne = -1;

        int cnt = 0;

        int i = 0;
        int j = 0;

        while(i < m && j < n)
        {
            if(nums1[i] < nums2[j])
            {
                if(cnt == mi) me = nums1[i];
                if(cnt == ni) ne = nums1[i];
                i++;
                cnt++;
            }
            else
            {
                if(cnt == mi) me = nums2[j];
                if(cnt == ni) ne = nums2[j];
                j++;
                cnt++;

            }


        }

        while(i < m)
        {
             if(cnt == mi) me = nums1[i];
                if(cnt == ni) ne = nums1[i];
                i++;
                cnt++;

        }

        while(j < n)
        {
            if(cnt == mi) me = nums2[j];
                if(cnt == ni) ne = nums2[j];
                j++;
                cnt++;

        }

        if(tot % 2 == 1)
        {
            return (double)me;
        }
        else
        {
            return (double)((double)(me + ne)) / 2.0;
        }


    }
}