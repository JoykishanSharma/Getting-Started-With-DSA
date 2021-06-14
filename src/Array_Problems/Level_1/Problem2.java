/*
* Problem Statement : Program to find the minimum (or maximum) element of an array
*/

package Array_Problems.Level_1;
import java.util.*;

public class Problem2 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        List<Integer> array = new ArrayList<>();

        // take array
        System.out.println("Enter the array size : ");
        int arraySize = scan.nextInt();
        System.out.println("Enter the array value : ");
        for (int i = 0; i < arraySize; i++){
            array.add(scan.nextInt());
        }

        System.out.println("Max value : " + Collections.max(array));
        System.out.println("Min value : " + Collections.min(array));

    }
}