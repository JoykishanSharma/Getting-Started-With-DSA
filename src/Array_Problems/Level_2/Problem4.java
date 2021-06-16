/*
* Problem Statement : Find duplicates in an array
*/

package Array_Problems.Level_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the array size : ");
        int arraySize = scan.nextInt();

        System.out.print("Enter the array values : ");
        List<Integer> array = new ArrayList<>();
        for (int i = 0; i < arraySize; i++) array.add(scan.nextInt());

        int i;

        for (i = 0; i < arraySize; i++) {
            int j = Math.abs(array.get(i));
            if (array.get(i) >= 0) {
                int a = (-1) * array.get(j);
                array.set(j, a);
            }
            else
                System.out.print(j + " ");
        }
    }
}
