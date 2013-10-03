package tasks.sorting;

/**
 * Created with IntelliJ IDEA.
 * User: david
 * Date: 10/3/13
 * Time: 11:15 PM
 * To change this template use File | Settings | File Templates.
 */
public class SelectionSort implements Sorter {

    @Override
    public int[] sort(int[] array) {
        int[] sortedArray = ArrayUtils.getCopiedArray(array);
        for (int i = 0; i < sortedArray.length; i++) {
            int min = sortedArray[i];
            for (int j = i; j < sortedArray.length; j++) {
                if (sortedArray[j] <= min) {
                    min = sortedArray[j];
                    sortedArray[j] = sortedArray[i];
                    sortedArray[i] = min;
                }
            }
        }
        return sortedArray;
    }
}
