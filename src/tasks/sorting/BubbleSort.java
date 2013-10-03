package tasks.sorting;

/**
 * Created with IntelliJ IDEA.
 * User: david
 * Date: 10/3/13
 * Time: 11:00 PM
 * To change this template use File | Settings | File Templates.
 */
public class BubbleSort implements Sorter {

    @Override
    public int[] sort(int[] array) {
        int[] sortedArray = ArrayUtils.getCopiedArray(array);

        for (int i = 0; i < sortedArray.length - 1; i++) {
            for (int j = 0; j < sortedArray.length - 1; j++) {
                if (sortedArray[j] > sortedArray[j + 1]) {
                    int tmp = sortedArray[j + 1];
                    sortedArray[j + 1] = sortedArray[j];
                    sortedArray[j] = tmp;
                }
            }
        }
        return sortedArray;
    }
}
