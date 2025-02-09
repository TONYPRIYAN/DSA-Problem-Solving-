class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) 
    {
        int m = nums1.length;
        int n = nums2.length;

        int[] arr = new int[m+n];

        System.arraycopy(nums1,0,arr,0,m);
        System.arraycopy(nums2,0,arr,m,n);

        Arrays.sort(arr);


        if((m+n) % 2 == 0)
        {
            float low = 0;
            float high = arr.length-1;
            float mid = low + (high-low)/2;

            double n1 = Math.floor(mid);
            double n2 = Math.ceil(mid);

            return (float)(arr[(int)n1]+arr[(int)n2])/2;



        }
        else
        {
            int low = 0;
            int high = arr.length-1;
            int mid = low + (high-low)/2;

            return arr[mid];

        }
    }
}