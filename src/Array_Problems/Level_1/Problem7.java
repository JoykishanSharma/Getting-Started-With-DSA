/*
* Problem Statement : Sort an array of 0s, 1s and 2s
*/

package Array_Problems.Level_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Problem7 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter array size : ");
        int arraySize = scan.nextInt();

        List<Integer> array = new ArrayList<>();
        System.out.print("Enter array values : ");

        for (int i = 0; i < arraySize; i++) array.add(scan.nextInt());
        Collections.sort(array);
        System.out.println(array);
    }
}
