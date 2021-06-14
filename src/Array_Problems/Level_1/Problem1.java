/*
 * Problem Statement : Check if a key is present in every segment of size k in an array
 */

package Array_Problems.Level_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        List<Integer> intArray = new ArrayList<>();
        int occurrenceCount = 0;

        // take array of size
        System.out.println("Enter array size : ");
        int sizeOfArray = scan.nextInt();

        // take array values
        System.out.println("Enter array values : ");
        for (int i = 0; i < sizeOfArray; i++){
            intArray.add(scan.nextInt());
        }

        // take search key
        System.out.println("Enter search key : ");
        int searchX = scan.nextInt();

        // take segment size
        System.out.println("Enter segment size : ");
        int segmentSizeK = scan.nextInt();

        int possibleSegment = Math.abs(sizeOfArray / segmentSizeK);
        if ((possibleSegment - (sizeOfArray % segmentSizeK)) < possibleSegment) possibleSegment++;
        int segmentStartPos = 0, segmentEndPos;

        for (int i = 0; i < possibleSegment; i++){
            segmentEndPos = segmentStartPos + segmentSizeK;
            if (segmentEndPos > sizeOfArray) segmentEndPos = sizeOfArray;
            if (intArray.subList(segmentStartPos, segmentEndPos).contains(searchX)) {
                System.out.println(intArray.subList(segmentStartPos, segmentEndPos));
                occurrenceCount++;
            }
            segmentStartPos = segmentEndPos;
        }

        if (occurrenceCount == possibleSegment) System.out.println("Yes");
        else System.out.println("No");

    }
}