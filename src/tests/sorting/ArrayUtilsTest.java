package tests.sorting;

import junit.framework.TestCase;
import tasks.sorting.ArrayUtils;

/**
 * Created with IntelliJ IDEA.
 * User: david
 * Date: 10/4/13
 * Time: 12:05 AM
 * To change this template use File | Settings | File Templates.
 */
public class ArrayUtilsTest extends TestCase {

    public void testConcatenateArray() throws Exception {
        int[] a = new int[] {1, 2, 3};
        int[] b = new int[] {4};
        int[] c = new int[] {5, 6};
        int[] resArray = new int[]{1, 2, 3, 4, 5, 6};
        int[] concatArray = ArrayUtils.concatenateArrays(a, b, c);
        for (int i = 0; i < resArray.length; i++) {
            assertEquals(resArray[i], concatArray[i]);
        }
    }
}
