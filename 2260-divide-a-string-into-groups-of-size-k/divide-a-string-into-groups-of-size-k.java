class Solution {
    public String[] divideString(String s, int k, char fill) 
    {

        ArrayList<String> arr = new ArrayList<>();
       
        int i = 0;

        while(i < s.length())
        {
            int end = Math.min(i+k,s.length());
            StringBuilder grp = new StringBuilder(s.substring(i,end));

            while(grp.length() < k)
            {
                grp.append(fill);
            }

            arr.add(grp.toString());

            i+=k;
        }

        return arr.toArray(new String[0]);
        
    }
}