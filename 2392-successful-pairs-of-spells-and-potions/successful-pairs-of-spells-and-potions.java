class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        
        int n = spells.length;
        int m = potions.length;
        int[] arr = new int[n];
        Arrays.sort(potions);
        for(int i=0;i<n;i++)
        {
            int spell = spells[i];
            int l = 0;
            int r = m-1;
            while(l <=r)
            {
                int mid = l + (r-l) /2;
                long prod = (long)spell * potions[mid];
                if(prod >= success)
                {
                    r = mid -1;
                }
                else
                {
                    l = mid +1;
                }
            }
            arr[i] = m - l;
        }

        return arr;
    }
}