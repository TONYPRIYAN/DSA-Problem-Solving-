class Solution {
    public String minWindow(String s, String t) 
    {

        if (s == null || t == null || s.length() < t.length()) {
        return "";
    }
        final Map<Character, Integer> required = new HashMap<>();
        for (char word : t.toCharArray()) {
            required.put(word, required.getOrDefault(word, 0) + 1);
        }
        

    Map<Character, Integer> windowCounts = new HashMap<>();
    int have = 0, need = required.size();
    int left = 0, right = 0;
    int minLen = Integer.MAX_VALUE;
    int minStart = 0;

    while (right < s.length()) {
        char c = s.charAt(right);
        windowCounts.put(c, windowCounts.getOrDefault(c, 0) + 1);

        if (required.containsKey(c) && windowCounts.get(c).intValue() == required.get(c).intValue()) {
            have++;
        }

        // Try to shrink the window from the left
        while (have == need) {
            if (right - left + 1 < minLen) {
                minLen = right - left + 1;
                minStart = left;
            }

            char leftChar = s.charAt(left);
            windowCounts.put(leftChar, windowCounts.get(leftChar) - 1);
            if (required.containsKey(leftChar) && windowCounts.get(leftChar).intValue() < required.get(leftChar).intValue()) {
                have--;
            }
            left++;
        }

        right++;
    }

    return minLen == Integer.MAX_VALUE ? "" : s.substring(minStart, minStart + minLen);
        
    }
}