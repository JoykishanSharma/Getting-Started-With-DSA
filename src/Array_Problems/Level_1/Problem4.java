/*
 * Problem Statement : C program to sort an array in ascending order
 */

package Array_Problems.Level_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the array size : ");
        int arraySize = scan.nextInt();

        System.out.println("Enter the array values : ");
        List<Integer> array = new ArrayList<>();
        for (int i = 0; i < arraySize; i++) array.add(scan.nextInt());

        Collections.sort(array);
        System.out.println("The Sorted array is : " + array);
    }
}
