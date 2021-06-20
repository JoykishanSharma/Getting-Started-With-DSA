/*
* Statement : Binary Search Algorithm
*/

package Algorithms.Search_Algorithms;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BinarySearch {
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

        int elementPosition = binarySearch(array, arraySize, searchElement);
        if (elementPosition != -1) System.out.println("Search Element is at index " + elementPosition);
        else System.out.println("Search Element not found!");

    }

    private static int binarySearch(List<Integer> array, int arraySize, int searchElement) {

        int max = arraySize - 1, min = 0;

        while(min <= max){

            int mid = Math.abs(max + min);

            if (array.get(mid) == searchElement) return mid;
            else if (array.get(mid) < searchElement) min = mid + 1;
            else max = mid - 1;
        }
        return -1;
    }
}
