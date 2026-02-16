// Traversal is the process of visiting each element of a data structure exactly once to perform some operation.


public class ScoreCalculator {
    public static void main(String[] args) {
        int[] scoreCard = {92, 13, 34, 41, 7, 6};
        int minScore = scoreCard[0];
        int maxScore = scoreCard[0];
        double avgScore;
        double sum = 0;
        for (int i = 0; i < scoreCard.length; i++) {
            if (scoreCard[i] < minScore) {
                minScore = scoreCard[i];
            }
            if (scoreCard[i] > maxScore) {
                maxScore = scoreCard[i];
            }
            sum += scoreCard[i];
        }
        avgScore = sum / scoreCard.length;
        System.out.println("The Minimum Score is : " + minScore);
        System.out.println("The Maximum Score is : " + maxScore);
        System.out.println("The Average Score is : " + avgScore);
    }
}
// OUTPUT : The Minimum Score is : 6
            The Maximum Score is : 92
            The Average Score is : 32.166666666666664
