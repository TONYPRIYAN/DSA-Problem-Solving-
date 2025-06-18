class Solution {
    public int maxPoints(int[][] points) {
        if (points.length <= 2) return points.length;

        int res = 1;

        for (int i = 0; i < points.length; i++) {
            Map<String, Integer> slopeMap = new HashMap<>();
            int currMax = 0;

            for (int j = i + 1; j < points.length; j++) {
                int dx = points[j][0] - points[i][0];
                int dy = points[j][1] - points[i][1];

                
                if (dx == 0) {
                    dy = 1; 
                } else if (dy == 0) {
                    dx = 1;
                } else {
                    int gcd = gcd(dy, dx);
                    dy /= gcd;
                    dx /= gcd;

                    
                    if (dx < 0) {
                        dx = -dx;
                        dy = -dy;
                    }
                }

                String slopeKey = dy + "/" + dx;
                slopeMap.put(slopeKey, slopeMap.getOrDefault(slopeKey, 0) + 1);
                currMax = Math.max(currMax, slopeMap.get(slopeKey));
            }

            res = Math.max(res, currMax + 1);  
        }

        return res;
    }

    
    private int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}