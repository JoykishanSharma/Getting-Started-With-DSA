/*
* Statement : Insertion Sorting Algorithm
*/

package Algorithms.Sort_Algorithms;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the array size : ");
        int arraySize = scan.nextInt();

        System.out.print("Enter the array values : ");
        List<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < arraySize; i++) arrayList.add(scan.nextInt());

        insertionSort(arrayList, arraySize);
        System.out.print("Sorted Array : " + arrayList);
    }

    private static void insertionSort(List<Integer> arrayList, int arraySize) {

        for (int i = 1; i < arraySize; i++) {
            int key = arrayList.get(i);
            int j = i - 1;
            while (j >= 0 && arrayList.get(j) > key){
                arrayList.set(j + 1, arrayList.get(j));
                j--;
            }
            arrayList.set(j+1, key);
        }
    }
}
