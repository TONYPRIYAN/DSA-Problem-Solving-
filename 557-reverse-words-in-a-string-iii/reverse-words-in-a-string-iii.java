class Solution {
    public String reverseWords(String s) 
    {
        String[] arr = s.trim().split("\\s+");
        StringBuilder s2  = new StringBuilder();

        for(int i=0;i<arr.length;i++)
        {
            StringBuilder str = new StringBuilder(arr[i]);
            s2.append(str.reverse());

            
                s2.append(" ");
            
        }

        return s2.toString().trim();
        
    }
}