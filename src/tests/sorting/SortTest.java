package tests.sorting;

import junit.framework.TestCase;
import tasks.sorting.BubbleSort;
import tasks.sorting.Sorter;

/**
 * Created with IntelliJ IDEA.
 * User: david
 * Date: 10/3/13
 * Time: 11:33 PM
 * To change this template use File | Settings | File Templates.
 */
public abstract class SortTest extends TestCase {
    protected int[] array = new int[] {5, 3, 1, 2, 6};
    protected int[] correctSortedArray = new int[]{1, 2, 3, 5, 6};

    public void testSort() throws Exception {
        int[] sortedArray = new BubbleSort().sort(array);
        for (int i = 0; i < sortedArray.length; i++) {
            assertEquals(correctSortedArray[i], sortedArray[i]);
        }
    }
    public abstract Sorter createSorter();
}
