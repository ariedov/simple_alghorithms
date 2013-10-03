package tasks.sorting;

/**
 * Created with IntelliJ IDEA.
 * User: david
 * Date: 10/3/13
 * Time: 11:39 PM
 * To change this template use File | Settings | File Templates.
 */
public class ArrayUtils {

    public static int[] getCopiedArray(int[] array) {
        int[] sortedArray = new int[array.length];
        System.arraycopy(array, 0, sortedArray, 0, array.length);
        return sortedArray;
    }

    public static int[] concatenateArrays(int[] ... arrays) {
        int collectiveLength = 0;
        for (int[] array : arrays) {
            collectiveLength += array.length;
        }

        int[] newArray = new int[collectiveLength];
        int settedElements = 0;
        for (int[] array : arrays) {
            System.arraycopy(array, 0, newArray, settedElements, array.length);
            settedElements += array.length;
        }
        return newArray;
    }
}
