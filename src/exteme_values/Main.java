package exteme_values;

/**
 * Created with IntelliJ IDEA.
 * User: david
 * Date: 9/25/13
 * Time: 9:33 PM
 * To change this template use File | Settings | File Templates.
 */
public class Main {
    public static void main(String[] args) {
        int[] array = new int[] {10, 15, -2, 3, 4};

        ExtremeValues extremeValues = new ExtremeValues();
        System.out.println("Max Value: " + extremeValues.maxValue(array));
        System.out.println("Min Value: " + extremeValues.minValue(array));
    }
}
