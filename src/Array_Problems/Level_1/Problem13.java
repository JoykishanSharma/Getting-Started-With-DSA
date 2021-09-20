/*
 * Problem Statement : Given a sorted and rotated array, find if there is a pair with a given sum
 */

package Array_Problems.Level_1;

import java.util.Scanner;

public class Problem13 {
    static int pos = 0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Enter the sum : ");
        int sum = scanner.nextInt();
        findSumWithRecursion(intArray, sum);
    }

    private static void findSumWithRecursion(int[] intArray, int sum) {

        for (int i = 0; i < intArray.length; i++) {
            if (i == pos) {
                continue;
            }

            int curSum = intArray[i] + intArray[pos];
            if (curSum == sum) {
                System.out.println("Sum pair found. They are at index " + i + " and " + pos);
                pos = -1;
                break;
            }
        }

        if (pos != -1) {
            pos++;
            findSumWithRecursion(intArray, sum);
        }
    }
}
