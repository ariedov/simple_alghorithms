package tests.sorting;

import junit.framework.TestCase;
import tasks.sorting.SelectionSort;
import tasks.sorting.Sorter;

/**
 * Created with IntelliJ IDEA.
 * User: david
 * Date: 10/3/13
 * Time: 11:32 PM
 * To change this template use File | Settings | File Templates.
 */
public class SelectionSortTest extends SortTest {

    @Override
    public Sorter createSorter() {
        return new SelectionSort();
    }
}
