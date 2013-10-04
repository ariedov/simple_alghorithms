package tasks.permutations;

/**
 * Created with IntelliJ IDEA.
 * User: david
 * Date: 10/4/13
 * Time: 9:17 PM
 * To change this template use File | Settings | File Templates.
 */
public class Utils {
    public static int factorial(int n) {
        if (n <= 1) {
            return 1;
        }
        return factorial(n - 1) * n;
    }
}
