/*
* Problem Statement : Find the Missing Number
*/

package Array_Problems.Level_2;

import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the array size : ");
        int arraySize = scan.nextInt();
        int missingSum = 0;

        System.out.print("Enter array values : ");
        for (int i = 0; i < arraySize - 1; i++) missingSum = missingSum + scan.nextInt();

        int fullSum = (arraySize  * (arraySize + 1)) / 2;
        System.out.println(fullSum - missingSum);
    }
}
