package tests.sorting;

import tasks.sorting.QuickSort;
import tasks.sorting.Sorter;

/**
 * Created with IntelliJ IDEA.
 * User: david
 * Date: 10/4/13
 * Time: 12:20 AM
 * To change this template use File | Settings | File Templates.
 */
public class QuickSortTest extends SortTest {
    @Override
    public Sorter createSorter() {
        return new QuickSort();
    }
}
