class Solution {
    public List<String> generateParenthesis(int n) 
    {
        List<String> arr2 = new ArrayList<>();

        track(arr2,"",0,0,n);
        return arr2;

        
    }

    public void track(List<String> arr2,String str,int open,int close,int n)
    {
        if(str.length() == 2*n)
        {
            arr2.add(str);
            return;
        }

        if(open < n)
        {
            track(arr2,str+"(",open+1,close,n);
        }

        if(close < open)
        {
            track(arr2,str+")",open,close+1,n);

        }

    }


}