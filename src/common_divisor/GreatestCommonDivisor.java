package common_divisor;

/**
 * Created with IntelliJ IDEA.
 * User: david
 * Date: 9/25/13
 * Time: 9:07 PM
 * To change this template use File | Settings | File Templates.
 */
public class GreatestCommonDivisor {
    public int euclidAlgorithm(int firstNumber, int secondNumber) {
        int maxNumber = Math.max(firstNumber, secondNumber);
        int minNumber = Math.min(firstNumber, secondNumber);
        int gcd = minNumber;

        while (maxNumber % minNumber != 0) {
            gcd = maxNumber % minNumber;
            maxNumber = minNumber;
            minNumber = gcd;
        }

        return gcd;
    }
}
