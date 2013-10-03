package tasks.sorting;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: david
 * Date: 10/3/13
 * Time: 11:37 PM
 * To change this template use File | Settings | File Templates.
 */
public class QuickSort implements Sorter {
    @Override
    public int[] sort(int[] array) {
        int[] sortedArray = ArrayUtils.getCopiedArray(array);
        return quickSort(sortedArray);
    }

    public int[] quickSort(int[] array) {
        if (array.length <= 1) {
            return array;
        }

        int pivot = array[0];
        int[] lessArray = new int[getElementsLessThanNCount(pivot, array)];
        int[] greaterArray = new int[getElementsGreaterThanNCount(pivot, array)];
        int lessWrited = 0;
        int greaterWrited = 0;
        for (Integer value : array) {
            if (value < pivot) {
                lessArray[lessWrited++] = value;
            } else if (value > pivot) {
                greaterArray[greaterWrited++] = value;
            }
        }

        return ArrayUtils.concatenateArrays(quickSort(lessArray), new int[] {pivot}, quickSort(greaterArray));
    }

    private int getElementsLessThanNCount(int n, int[] array) {
        int elementsCount = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < n) {
                elementsCount++;
            }
        }
        return elementsCount;
    }

    private int getElementsGreaterThanNCount(int n, int[] array) {
        int elementsCount = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > n) {
                elementsCount++;
            }
        }
        return elementsCount;
    }


}
