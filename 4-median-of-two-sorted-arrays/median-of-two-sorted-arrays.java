class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) 
    {

        List<Integer> list = new ArrayList<>();

        for(int x : nums1)
        {
            list.add(x);
        }

        for(int x : nums2)
        {
            list.add(x);
        }

        Collections.sort(list);

        int n = list.size();
        int num = n/2;
        if(n%2 == 1)
        {
            return (double) list.get(num);
        }
        else
        {
            double sum = list.get(num) + list.get(num-1);
            return sum/2;
        }
        
    }
}