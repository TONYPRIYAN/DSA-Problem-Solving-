class Solution {
    public int characterReplacement(String s, int k)
    {

        int maxlen = 0;
        int l = 0;
        int[] arr = new int[26];
        int max = 0;

        for(int r = 0;r< s.length();r++)
        {
            max = Math.max(max,++arr[s.charAt(r) - 'A']);

            if(r-l+1-max > k)
            {
                arr[s.charAt(l)-'A']--;
                l++;
            }

            maxlen = Math.max(maxlen,r-l+1);

        }

        return maxlen;
        
    }
}