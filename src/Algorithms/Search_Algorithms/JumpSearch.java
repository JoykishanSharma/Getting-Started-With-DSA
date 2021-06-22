/*
* Statement : Jump Search or Block Search Algorithm
*/

package Algorithms.Search_Algorithms;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JumpSearch {
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

        int elementPosition = jumpSearch(array, arraySize, searchElement);
        if (elementPosition != -1) System.out.println("Search Element is at index " + elementPosition);
        else System.out.println("Search Element not found!");
    }

    private static int jumpSearch(List<Integer> array, int arraySize, int searchElement) {

        int low = 0;
        int jumpInterval = (int) Math.sqrt(arraySize);

        while(array.get(jumpInterval) < searchElement){
            low = jumpInterval;
            jumpInterval = jumpInterval + (int) Math.sqrt(arraySize);

            if (jumpInterval > (arraySize - 1)){
                jumpInterval = arraySize - 1;
                break;
            }
        }

        for (int i = low; i <= jumpInterval; i++) if (array.get(i) == searchElement) return i;
        return -1;
    }
}
