package tasks.permutations;

import java.util.Collection;
import java.util.Collections;

/**
 * Created with IntelliJ IDEA.
 * User: david
 * Date: 10/4/13
 * Time: 9:15 PM
 * To change this template use File | Settings | File Templates.
 */
public class MyPermutator implements Permutator {
    private int[][] permutations;
    private int savedPermutations = 0;

    @Override
    public int[][] permute(int[] array) {
        permutations = initPermutationArrayHolder(array);
        savedPermutations = 0;
        performPermutation(array, 0);
        return permutations;
    }

    // todo: check step by step how this shit is working
    private int[][] initPermutationArrayHolder(int[] initArray) {
        int permutationsCount = Utils.factorial(initArray.length);
        int[][] permutations = new int[permutationsCount][];

        for (int i = 0; i < permutations.length; i++) {
            permutations[i] = new int[initArray.length];
        }
        return permutations;
    }

    private void performPermutation(int[] array, int index) {
        for(int i = index; i < array.length; i++) {
            array = swapArrayElements(array, index, i);
            performPermutation(array, index + 1);

            // backtracking, for removing equal permutations
            array = swapArrayElements(array, i, index);
        }

        if (index == array.length - 1) {
            System.arraycopy(array, 0, permutations[savedPermutations++], 0, array.length);
        }
    }

    private int[] swapArrayElements(int[] array, int src, int target) {
        int tmp = array[src];
        array[src] = array[target];
        array[target] = tmp;
        return array;
    }
}