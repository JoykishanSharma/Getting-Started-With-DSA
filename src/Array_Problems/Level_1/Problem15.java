/*
 * Problem Statement : Find the Rotation Count in Rotated Sorted array
 */

package Array_Problems.Level_1;

public class Problem15 {
    public static void main(String[] args) {
        int[] intArray = {15, 18, 2, 3, 6, 12};
        int smallestValPos = findSmallestValPos(intArray);
        System.out.println("No of rotation : " + smallestValPos);
    }

    private static int findSmallestValPos(int[] intArray) {
        int minPos = Integer.MAX_VALUE;
        for (int j : intArray) {
            if (j < minPos) {
                minPos = j;
            }
        }
        return minPos;
    }
}
