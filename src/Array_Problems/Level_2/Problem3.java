/*
* Problem Statement : Count pairs with given sum
*/

package Array_Problems.Level_2;

import java.util.*;

public class Problem3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the array size : ");
        int arraySize = scan.nextInt();

        System.out.print("Enter the array values : ");
        List<Integer> array = new ArrayList<>();
        for (int i = 0; i < arraySize; i++) array.add(scan.nextInt());

        System.out.print("Enter the sum value : ");
        int sum = scan.nextInt();

        int count = 0;
        for (int i = 0; i < arraySize; i++) for (int j = i + 1; j < arraySize; j++) if (array.get(i) + array.get(j) == sum) count++;

        System.out.println(count);
    }
}
