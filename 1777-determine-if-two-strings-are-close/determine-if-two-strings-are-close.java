class Solution {
    public boolean closeStrings(String word1, String word2) 
    {
        if(word1.length() != word2.length())
        return false;
        int n = 26;

        int[] arr1 = new int[n];
        int[] arr2 = new int[n];

        for(char c : word1.toCharArray())
        {
            arr1[c-'a']++;
        }

        for(char c : word2.toCharArray())
        {
            arr2[c-'a']++;
        }

        for(int i=0;i<n;i++)
        {
            if(arr1[i] == arr2[i]) continue;

            if(arr1[i] == 0|| arr2[i] == 0) return false;
        }

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        for(int i=0;i<n;i++)
        {
            if(arr1[i] != arr2[i])
            {
                return false;
            }
        }

        return true;


        
        
    }
}