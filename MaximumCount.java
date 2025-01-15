// https://leetcode.com/problems/maximum-count-of-positive-integer-and-negative-integer/submissions/1509556974/

import java.util.Scanner;

public class MaximumcountACCEPTED {
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        int n =  scannerObject.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++) {
            arr[i] = scannerObject.nextInt();
        }
        System.out.println(maximumCount(arr));
        scannerObject.close();
    }

    public static int maximumCount(int[] arr) {
        int negativeCount = 0, positiveCount = 0;
        for(int i = 0 ; i < arr.length ; i++) {
            if(arr[i] < 0) 
                negativeCount++;
            else if(arr[i] > 0)
                positiveCount++;
        }
        return (negativeCount > positiveCount) ? negativeCount : positiveCount;
    }
}
