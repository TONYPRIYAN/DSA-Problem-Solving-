class Solution {
    public int hIndex(int[] citations) 
    {
        int len = citations.length;
        int[] cou = new int[len+1];


        for(int c : citations)
        {
            if(c > len)
            {
                cou[len]++;
            }
            else
            {
                cou[c]++;
            }

        }

        int tot = 0;
        for(int i = len;i>=0;i--)
        {
            tot += cou[i];
            if(tot >= i)
            return i;
        }

        return 0;
        
        
    }
}