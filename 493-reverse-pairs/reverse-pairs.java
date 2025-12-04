class Solution {
    public int reversePairs(int[] nums) 
    {
        int n = nums.length;

        return mergesort(nums,0,n-1);
        
    }


    public int mergesort(int[] nums,int l,int h)
    {
        int cnt =0;

        if(l >= h) return cnt;
        int m = l + (h - l) / 2;
        cnt += mergesort(nums,l,m);
        cnt += mergesort(nums,m+1,h);
        cnt += count(nums,l,m,h);
        merge(nums,l,m,h);
        return cnt;

    }

    public static int count(int[] arr,int l,int m,int h)
    {
        int r = m+1;
        int cnt = 0;

        for(int i = l;i<=m;i++)
        {
            while(r <= h && (long) arr[i] > 2L * arr[r])
            {
                r++;
            }
            cnt+= r - (m+1);
        }
        return cnt;

    }

    public static void merge(int[] arr,int l,int m,int h)
    {
         ArrayList<Integer> temp = new ArrayList<>(); 
        int left = l;      
        int right = m + 1;  


        while (left <= m && right <= h) {
            if (arr[left] <= arr[right]) {
                temp.add(arr[left]);
                left++;
            } else {
                temp.add(arr[right]);
                right++;
            }
        }


        while (left <= m) {
            temp.add(arr[left]);
            left++;
        }

        while (right <= h) {
            temp.add(arr[right]);
            right++;
        }

        for (int i = l; i <= h; i++) {
            arr[i] = temp.get(i - l);
        }

    }
}