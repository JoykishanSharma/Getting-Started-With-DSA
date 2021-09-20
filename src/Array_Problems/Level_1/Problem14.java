/*
 * Problem Statement : Find maximum value of Sum( i*arr[i]) with only rotations on given array allowed
 */

package Array_Problems.Level_1;

public class Problem14 {

    public static void main(String[] args) {
        int[] intArray = {1, 20, 2, 10};
        findMaxSum(intArray, intArray.length);
    }

    private static void findMaxSum(int[] intArray, int length) {
        int max = Integer.MIN_VALUE;
        int rotationCount = 0;
        for (int i = 0; i < length; i++) {
            int sum = 0;
            for (int j = 0; j < length; j++) {
                sum += j * intArray[j];
            }
            if (sum > max) {
                max = sum;
            } else {
                rotationCount++;
                rotateArray(intArray, length);
            }
        }

        System.out.println("We can get " + max + " by rotating array " + rotationCount + " times.");
    }

    // rotate anti-clockwise
    static void rotateArray(int[] intArray, int size) {
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < size - 1; j++) {
                int temp = intArray[j];
                intArray[j] = intArray[j+1];
                intArray[j+1] = temp;
            }
        }
    }
}
