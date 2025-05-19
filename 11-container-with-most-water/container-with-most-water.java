class Solution {
    public int maxArea(int[] arr) 
    {
        int l = 0;
        int r =arr.length-1;
        int res = 0;
        


        while(l<r)
        {
            
            res = Math.max(res,(r-l)*Math.min(arr[l],arr[r]));

            if(arr[l] < arr[r]) l++;
            else r--;

        }
        
        return res;
    }
}