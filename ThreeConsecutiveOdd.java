// https://leetcode.com/problems/three-consecutive-odds/submissions/1498856696/

import java.util.Scanner;

public class ThreeConsecutiveOddLCDCACCEPTED {
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        int n = scannerObject.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++) {
            arr[i] = scannerObject.nextInt();
        }
        System.out.println(isConsecutiveOdd(arr));
        scannerObject.close();
    }

    public static boolean isConsecutiveOdd(int[] arr) {
        for(int i = 0 ; i < arr.length - 2 ; i++) {
            if((arr[i]%2 != 0) && (arr[i + 1]%2 != 0) && (arr[i + 2]%2 != 0)) {
                return true;
            }
        }
        return false;
    }
}
