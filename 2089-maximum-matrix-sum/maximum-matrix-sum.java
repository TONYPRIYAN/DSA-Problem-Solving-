class Solution {
    public long maxMatrixSum(int[][] matrix) {
        int minimumAbsValue = Integer.MAX_VALUE;
        long totalSum = 0;
        int negativeCount = 0;

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {

                if (matrix[row][col] < 0) {
                    negativeCount++;
                }

                int absoluteValue = Math.abs(matrix[row][col]);
                minimumAbsValue = Math.min(minimumAbsValue, absoluteValue);
                totalSum += absoluteValue;
            }
        }

        if (negativeCount % 2 == 0) {
            return totalSum;
        }

        return totalSum - 2L * minimumAbsValue;

    }
}