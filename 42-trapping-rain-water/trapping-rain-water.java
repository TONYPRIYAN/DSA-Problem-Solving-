class Solution {
    public int trap(int[] arr) 
    {
        int n = arr.length;

        int[] pre = new int[n];
        int[] suf = new int[n];

        pre[0] = arr[0];
        for(int i=1;i<n;i++)
        {
            pre[i] = Math.max(pre[i-1],arr[i]);
        }

        for(int x : pre)
        {
            System.out.print(x+" ");
        }

        suf[n-1] = arr[n-1];
        for(int i=n-2;i>0;i--)
        {
            suf[i] = Math.max(suf[i+1],arr[i]);
        }

        for(int x : suf)
        {
            System.out.print(x+" ");
        }


        int count = 0;
        for(int i=1;i<n;i++)
        {
            count += Math.min(pre[i],suf[i])-arr[i];
        }


        return count;
    }
}