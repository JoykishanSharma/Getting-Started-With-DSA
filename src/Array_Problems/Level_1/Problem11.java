/*
 * Problem Statement : Rotate array of size n by d elements
 */

package Array_Problems.Level_1;

import java.util.Arrays;
import java.util.Scanner;

public class Problem11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] intArray = new int[]{1, 2, 3, 4, 5, 6, 7};
        int size = intArray.length;
        System.out.println("Enter the shift value : ");
        int digit = scanner.nextInt();
        rotateArray(intArray, digit, size);
        System.out.println(Arrays.toString(intArray));
    }

    static void rotateArray(int[] intArray, int digit, int size) {
        for (int i = 0; i < digit; i++) {
            for (int j = 0; j < size - 1; j++) {
                int temp = intArray[j];
                intArray[j] = intArray[j+1];
                intArray[j+1] = temp;
            }
        }
    }

}
