/*
* Problem Statement : Find the frequency of a number in an array
*/

package Array_Problems.Level_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem6 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the array size : ");
        int arraySize = scan.nextInt();
        System.out.print("Enter the array values : ");
        List<Integer> array = new ArrayList<>();
        for (int i = 0; i < arraySize; i++) array.add(scan.nextInt());
        System.out.print("Enter the number : ");
        int n = scan.nextInt();
        int count = 0;
        for (int i: array) if (n == i) count++;
        System.out.print("The Frequency of number " + n +  " in array is : " + count);
    }
}
