class Solution {
    public String reverseVowels(String s) 
    {
        char[] arr = s.toCharArray();
        String vow = "AEIOUaeiou";
        int l = 0;
        int r = s.length()-1;

        while (l<r)
        {
            while(l < r && vow.indexOf(arr[l]) == -1)
            l++;

            while(l < r && vow.indexOf(arr[r]) == -1)
            r--;


            char tmp = arr[l];
            arr[l] = arr[r];
            arr[r] = tmp;

            l++;
            r--;

        }

        return new String(arr);
        
    }
}