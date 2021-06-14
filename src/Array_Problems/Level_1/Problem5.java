/*
* Problem Statement : K’th Smallest/Largest Element in Unsorted Array
*/

package Array_Problems.Level_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        // user input
        System.out.print("Enter array size : ");
        int arraySize = scan.nextInt();

        System.out.print("Enter array values : ");
        List<Integer> array = new ArrayList<>();
        for (int i = 0; i < arraySize; i++) array.add(scan.nextInt());

        System.out.print("Enter k value : ");
        int k = scan.nextInt();

        Collections.sort(array);
        System.out.println("Kth Smallest value is : " + array.get(k - 1));
        Collections.reverse(array);
        System.out.println("Kth Largest value is : " + array.get(k - 1));
    }
}
