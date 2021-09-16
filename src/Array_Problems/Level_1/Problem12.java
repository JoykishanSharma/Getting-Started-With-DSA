/*
 * Problem Statement : Cyclically rotate an array by one
 */

package Array_Problems.Level_1;

import java.util.Arrays;

public class Problem12 {
    public static void main(String[] args) {
        int[] intArray = new int[]{1, 2, 3, 4, 5};
        int size = intArray.length;
        int cyclicRotation = 1;
        rotateArray(intArray, cyclicRotation, size);
        System.out.println(Arrays.toString(intArray));
    }

    static void rotateArray(int[] intArray, int cyclicRotation, int size) {
        for (int i = 0; i < size - cyclicRotation; i++) {
            for (int j = 0; j < size - 1; j++) {
                int temp = intArray[j+1];
                intArray[j+1] = intArray[j];
                intArray[j] = temp;
            }
        }
    }

}
