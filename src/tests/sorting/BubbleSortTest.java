package tests.sorting;

import junit.framework.TestCase;
import tasks.sorting.BubbleSort;
import tasks.sorting.Sorter;

/**
 * Created with IntelliJ IDEA.
 * User: david
 * Date: 10/3/13
 * Time: 11:08 PM
 * To change this template use File | Settings | File Templates.
 */
public class BubbleSortTest extends SortTest {

    @Override
    public Sorter createSorter() {
        return new BubbleSort();
    }
}
