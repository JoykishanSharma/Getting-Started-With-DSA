/*
* Problem Statement : Union and Intersection of two sorted arrays
*/

package Array_Problems.Level_1;

import java.util.*;

public class Problem10 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the 1st array size : ");
        int arraySize1 = scan.nextInt();

        List<Integer> array1 = new ArrayList<>();
        System.out.print("Enter the 1st array values : ");
        for (int i = 0; i < arraySize1; i++) array1.add(scan.nextInt());

        System.out.print("Enter the 2nd array size : ");
        int arraySize2 = scan.nextInt();

        List<Integer> array2 = new ArrayList<>();
        System.out.print("Enter the 2nd array values : ");
        for (int i = 0; i < arraySize2; i++) array2.add(scan.nextInt());

        // union
        Set<Integer> hashSet = new HashSet<>();
        hashSet.addAll(array1);
        hashSet.addAll(array2);
        System.out.println("Union : " + hashSet);

        //intersection
        List<Integer> intersectionList = new ArrayList<>();
        for (int element: array1) if (array2.contains(element)) intersectionList.add(element);
        System.out.println("Intersection : " + intersectionList);
    }
}
