/*
* Statement : Bubble Sorting Algorithm
*/

package Algorithms.Sort_Algorithms;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the array size : ");
        int arraySize = scan.nextInt();

        System.out.print("Enter the array values : ");
        List<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < arraySize; i++) arrayList.add(scan.nextInt());

        bubbleSort(arrayList, arraySize);
        System.out.print("Sorted Array : " + arrayList);
    }

    private static void bubbleSort(List<Integer> arrayList, int arraySize) {

        for (int i = 0; i < arraySize; i++) {
            for (int j = i+1; j < arraySize; j++) {
                if (arrayList.get(i) > arrayList.get(j)) {
                    int temp = arrayList.get(j);
                    arrayList.set(j, arrayList.get(i));
                    arrayList.set(i, temp);
                }
            }
        }
    }
}
