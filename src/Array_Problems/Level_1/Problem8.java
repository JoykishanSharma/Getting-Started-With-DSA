/*
* Problem Statement : Range and Coefficient of range of Array
*/

package Array_Problems.Level_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Problem8 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the array size : ");
        int arraySize = scan.nextInt();

        System.out.print("Enter the array values : ");
        List<Integer> array = new ArrayList<>();
        for (int i = 0; i < arraySize; i++) array.add(scan.nextInt());

        int max = Collections.max(array), min = Collections.min(array);
        System.out.println("Range : " + (max - min));
        System.out.println("Coefficient of Range : " + (float)(max - min) / (max + min));
    }
}
