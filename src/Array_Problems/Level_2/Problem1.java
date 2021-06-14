/*
* Problem Statement : Program to cyclically rotate an array by one
*/

package Array_Problems.Level_2;

import java.util.*;

public class Problem1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter array size : ");
        int arraySize = scan.nextInt();

        System.out.print("Enter array value : ");
        List<Integer> integerList = new ArrayList<>();
        for (int i = 0; i < arraySize; i++) integerList.add(scan.nextInt());

        int lastElement = integerList.get(arraySize - 1);

        for (int i = arraySize - 1; i > 0; i--) {
            int temp = integerList.get(i);
            integerList.set(i, integerList.get(i - 1));
            integerList.set(i - 1, temp);
        }

        integerList.set(0, lastElement);
        System.out.println(integerList);
    }
}
