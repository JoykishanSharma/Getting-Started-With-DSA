/*
* Problem Statement : Move all negative numbers to beginning and positive to end with constant extra space
*/

package Array_Problems.Level_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Problem9 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the array size : ");
        int arraySize = scan.nextInt();

        System.out.print("Enter the array value : ");
        List<Integer> array = new ArrayList<>();
        for (int i = 0; i < arraySize; i++) array.add(scan.nextInt());

        Collections.sort(array);
        System.out.println(array);
    }
}
