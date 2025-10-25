class Solution {
    public int totalMoney(int n) 
    {
      
      int[] arr = {1,2,3,4,5,6,7};
    int tot = 0;

    int j = 0;
    for(int i=n;i>0;i--)
    {
        if(j == arr.length)
        {
            j = 0;
        }
        tot += arr[j];
        arr[j]++;
        j++;
       
    }

    return tot;
       
        
    }
}