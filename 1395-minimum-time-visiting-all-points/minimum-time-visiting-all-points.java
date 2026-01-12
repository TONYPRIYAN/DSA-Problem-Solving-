class Solution {
    public int minTimeToVisitAllPoints(int[][] points) 
    {
        int tot = 0;

        for(int i=0;i<points.length-1;i++)
        {
            tot += Distance(points[i],points[i+1]);
        }

        return tot;
        
    }

    public int Distance(int[] a,int[] b)
    {
        int dx = Math.abs(a[0] - b[0]);
        int dy = Math.abs(a[1] - b[1]);

        return Math.max(dx,dy);

    }
}