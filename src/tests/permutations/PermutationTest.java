package tests.permutations;

import junit.framework.TestCase;
import tasks.permutations.MyPermutator;

/**
 * Created with IntelliJ IDEA.
 * User: david
 * Date: 10/4/13
 * Time: 9:48 PM
 * To change this template use File | Settings | File Templates.
 */
public class PermutationTest extends TestCase {
    private int[][][] permutationAnswers = new int[][][]{
            {{1, 2, 3}},
            {{1, 2, 3}, {1, 3, 2}, {2, 1, 3}, {3, 1, 2}, {2, 3, 1}, {3, 2, 1}},
    };


    public void testPermutation() throws Exception {
        int[][] calculatedPermutations = new MyPermutator().permute(permutationAnswers[0][0]);

        assertTrue(compareMatrix(permutationAnswers[1], calculatedPermutations));
    }

    private boolean compareMatrix(int[][] firstMatrix, int[][] secondMatrix) {
        boolean equals = false;
        if (firstMatrix.length == secondMatrix.length) {
            equals = true;
            for (int i = 0; i < firstMatrix.length && equals; i++) {
                equals = false;
                for (int j = 0; j < secondMatrix.length && !equals; j++) {
                    equals = compareArrays(firstMatrix[i], secondMatrix[j]);
                }
            }
        }
        return equals;
    }

    private boolean compareArrays(int[] firstArray, int[] secondArray) {
        boolean equals = false;
        if (firstArray.length == secondArray.length) {
            equals = true;
            for (int i = 0; i < firstArray.length && equals; i++) {
                equals = firstArray[i] == secondArray[i];
            }
        }

        return equals;
    }
}
