// https://leetcode.com/problems/minimum-average-of-smallest-and-largest-elements/submissions/1495353718/

import java.util.HashSet;
import java.util.Scanner;

public class SmallLargeMinAverageACCEPTED {
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        int n = scannerObject.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++)
            arr[i] = scannerObject.nextInt();
        System.out.println(smallLargeMinAverage(n, arr));
        scannerObject.close();
    }

    public static double smallLargeMinAverage(int n, int[] arr) {
        double minimumAverage = Integer.MAX_VALUE;
        HashSet<Integer> visitedIndices = new HashSet<>();
        for(int i = 1 ; i <= (n / 2) ; i++) {
            int[] output = findingMinMaxElements(n, arr, visitedIndices);
            minimumAverage = (minimumAverage > ((output[0] + output[1]) / 2.0)) ? (double) ((output[0] + output[1]) / 2.0) : minimumAverage;
        }
        return minimumAverage;
    }

    public static int[] findingMinMaxElements(int n, int[] arr, HashSet<Integer> visitedIndices) {
        int minElement = Integer.MAX_VALUE;
        int maxElement = Integer.MIN_VALUE;
        int minIndex = -1;
        int maxIndex = -1;
        for(int i = 0 ; i < n ; i++) {
            if(maxElement < arr[i] && (!visitedIndices.contains(i))) {
                maxElement = arr[i];
                maxIndex = i;
            }
            if(minElement > arr[i] && (!visitedIndices.contains(i))) {
                minElement = arr[i];
                minIndex = i;
            }
        }
        visitedIndices.add(minIndex);
        visitedIndices.add(maxIndex);
        return new int[] {minElement, maxElement};
    }
}
