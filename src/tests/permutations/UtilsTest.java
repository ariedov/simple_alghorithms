package tests.permutations;

import junit.framework.TestCase;
import tasks.permutations.Utils;

/**
 * Created with IntelliJ IDEA.
 * User: david
 * Date: 10/4/13
 * Time: 9:17 PM
 * To change this template use File | Settings | File Templates.
 */
public class UtilsTest extends TestCase {

    private int[][] factorialValues = new int[][] {
            {0, 1},
            {1, 1},
            {2, 2},
            {3, 6},
            {4, 24},
            {5, 120}
    };

    public void testFactorial() throws Exception {
        for (int i = 0; i < factorialValues.length; i++) {
            int n = factorialValues[i][0];
            int answer = factorialValues[i][1];
            assertEquals(answer, Utils.factorial(n));
        }
    }
}
