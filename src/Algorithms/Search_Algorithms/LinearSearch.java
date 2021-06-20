/*
* Statement : Linear Search Algorithm
*/

package Algorithms.Search_Algorithms;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the array size : ");
        int arraySize = scan.nextInt();

        System.out.print("Enter the array values : ");
        List<Integer> array = new ArrayList<>();
        for (int i = 0; i < arraySize; i++) {
            array.add(scan.nextInt());
        }

        System.out.print("Enter the search element : ");
        int searchElement = scan.nextInt();

        int elementPosition = linearSearch(array, arraySize, searchElement);
        if (elementPosition != -1) System.out.println("Search Element is at index " + elementPosition);
        else System.out.println("Search Element not found!");
    }

    private static int linearSearch(List<Integer> array, int n, int searchElement) {

        for (int i = 0; i < n; i++) {
            if (array.get(i) == searchElement) return i;
        }
        return -1;
    }
}
