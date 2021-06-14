/*
* Problem Statement : Write a program to reverse an array or string
*/

package Array_Problems.Level_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //choice for array or string
        System.out.println("1. Reverse a String");
        System.out.println("2. Reverse a Integer Array");
        System.out.print("Choose option : ");
        int choose = scan.nextInt();

        if (choose == 1){
            System.out.print("Enter the String : ");
            String string = scan.next();

            StringBuilder stringBuilder = new StringBuilder(string);
            String rev = stringBuilder.reverse().toString();
            System.out.println("Reverse String is : " + rev);
        }
        else if (choose == 2){
            System.out.print("Enter array size : ");
            int arraySize = scan.nextInt();

            List<Integer> intArray = new ArrayList<>();
            System.out.print("Enter the Array values : ");
            for(int i = 0; i < arraySize; i++) intArray.add(scan.nextInt());

            Collections.reverse(intArray);
            System.out.println("Reverse Array is : " + intArray);
        }
        else {
            System.out.println("Wrong Choose!");
        }

    }
}
