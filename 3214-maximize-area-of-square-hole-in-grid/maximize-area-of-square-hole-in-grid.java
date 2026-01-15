class Solution {
    public int maximizeSquareHoleArea(int n, int m, int[] hBars, int[] vBars) {
        int side = Math.min(getMaxGap(hBars), getMaxGap(vBars));
        return side * side;
    }

    private int getMaxGap(int[] bars) {
        Arrays.sort(bars);
        int max = 1, count = 1;
        
        for (int i = 1; i < bars.length; i++) {
            if (bars[i] == bars[i - 1] + 1) {
                count++;
            } else {
                count = 1;
            }
            max = Math.max(max, count);
        }
        
        return max + 1;
    }
}