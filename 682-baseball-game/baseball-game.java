class Solution {
    public int calPoints(String[] operations) 
    {
       Stack<Integer> scoreStack = new Stack<>();

        for (String op : operations) {

            if (op.equals("C")) {
                scoreStack.pop();

            } else if (op.equals("D")) {
                scoreStack.push(scoreStack.peek() * 2);

            } else if (op.equals("+")) {
                int last = scoreStack.pop();
                int secondLast = scoreStack.peek();
                scoreStack.push(last);
                scoreStack.push(last + secondLast);

            } else {
                scoreStack.push(Integer.parseInt(op));
            }
        }

        int totalScore = 0;
        for (int score : scoreStack) {
            totalScore += score;
        }

        return totalScore;
        
    }
}