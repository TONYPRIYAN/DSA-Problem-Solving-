class Solution {
    public String sortVowels(String s) 
    {
        ArrayList<Character> arr = new ArrayList<>();

        String vow = "AEIOUaeiou";

        for(char c : s.toCharArray())
        {
            if(vow.indexOf(c) != -1)
            {
                arr.add(c);
            }
        }
        Collections.sort(arr);
        String t = "";
        int i=0;
        for(char c : s.toCharArray())
        {
            if(vow.indexOf(c) != -1)
            {
                t += arr.get(i++);
            }
            else
            {
                t += c;
            }
        }

        System.out.println(t);
        return t;
        
    }
}