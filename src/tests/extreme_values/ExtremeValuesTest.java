package tests.extreme_values;

import tasks.exteme_values.ExtremeValues;
import junit.framework.TestCase;

/**
 * Created with IntelliJ IDEA.
 * User: david
 * Date: 9/25/13
 * Time: 9:35 PM
 * To change this template use File | Settings | File Templates.
 */
public class ExtremeValuesTest extends TestCase {
    private ExtremeValues extremeValues = new ExtremeValues();
    int[] array = new int[] {2, 5, 1, 15, -5};

    public void testMaxValue() throws Exception {
        assertEquals(15, extremeValues.maxValue(array));
    }

    public void testMinValue() throws Exception {
        assertEquals(-5, extremeValues.minValue(array));
    }
}
