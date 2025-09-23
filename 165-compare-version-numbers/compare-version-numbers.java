class Solution {
    public int compareVersion(String version1, String version2) 
    {
        String[] arr1 = version1.split("\\.");
        String[] arr2 = version2.split("\\.");

        
        int len = Math.max(arr1.length,arr2.length);

        for(int i=0;i<len;i++)
        {
            Integer v1 = i < arr1.length ? Integer.parseInt(arr1[i]) : 0;
            Integer v2 = i < arr2.length ? Integer.parseInt(arr2[i]) : 0;

            int ans = v1.compareTo(v2);

            if(ans != 0)
                return ans;

        }

        return 0;
        
    }
}