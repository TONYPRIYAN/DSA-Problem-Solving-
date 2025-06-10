class Solution {
    public int maxDifference(String s) {
        Map<Character, Integer> freqMap = new HashMap<>();

        for (char c : s.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }

        int maxOdd = Integer.MIN_VALUE;
        int minEven = Integer.MAX_VALUE;

        for (int freq : freqMap.values()) {
            if (freq % 2 == 0) {
                minEven = Math.min(minEven, freq);
            } else {
                maxOdd = Math.max(maxOdd, freq);
            }
        }

        if (maxOdd == Integer.MIN_VALUE || minEven == Integer.MAX_VALUE) {
            return 0;
        }

        return maxOdd - minEven;
    }
}
