class Solution {
    public int maxArea(int[] arr) 
    {
        int l = 0;
        int r =arr.length-1;
        int res = 0;
        int area = 0;


        while(l<=r)
        {
            area = (r-l)*Math.min(arr[l],arr[r]);
            res = Math.max(res,area);

            if(arr[l] < arr[r]) l++;
            else r--;

        }
        
        return res;
    }
}