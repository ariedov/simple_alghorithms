package tests.common_divisor;

import tasks.common_divisor.GreatestCommonDivisor;
import junit.framework.TestCase;

/**
 * Created with IntelliJ IDEA.
 * User: david
 * Date: 9/25/13
 * Time: 9:16 PM
 * To change this template use File | Settings | File Templates.
 */
public class GreatestCommonDivisorTest extends TestCase {
    private GreatestCommonDivisor gcd = new GreatestCommonDivisor();
    int[][] commonDivisorAnswers = new int[][] {
            {423, 132, 3},
            {1071, 462, 21},
            {34, 76, 2},
    };


    public void testEuclidAlgorithm() throws Exception {
        for (int[] commonDivisorAnswer : commonDivisorAnswers) {
            int firstNumber = commonDivisorAnswer[0];
            int secondNumber = commonDivisorAnswer[1];
            int calcAnswer = gcd.euclidAlgorithm(firstNumber, secondNumber);
            assertEquals(commonDivisorAnswer[2], calcAnswer);
        }
    }
}
