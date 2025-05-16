class Solution {
    public String reverseWords(String s) 
    {
        String[] arr = s.trim().split("\\s+");

        StringBuilder s2 = new StringBuilder();
        for(int i=arr.length-1;i>=0;i--)
        {
            s2.append(arr[i]+" ");
        }

        return s2.toString().trim();
        
    }
}