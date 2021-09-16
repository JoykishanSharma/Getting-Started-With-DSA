/*
* Statement : Quick Sorting Algorithm
 */

package Algorithms.Sort_Algorithms;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuickSort {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the array size : ");
        int arraySize = scan.nextInt();

        System.out.print("Enter the array values : ");
        List<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < arraySize; i++) arrayList.add(scan.nextInt());

        quickSort(arrayList, arraySize);
        System.out.print("Sorted Array : " + arrayList);
    }

    private static void quickSort(List<Integer> arrayList, int arraySize) {
        
    }
}
