// https://leetcode.com/problems/find-if-digit-game-can-be-won/submissions/1464898507/

import java.util.Scanner;

public class DigitGameWonACCEPTED {
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        int n = scannerObject.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++) {
            arr[i] = scannerObject.nextInt();
        }
        System.out.println(canAliceWin(arr));
        scannerObject.close();
    }    

    public static boolean canAliceWin(int[] arr) {
        int singleDigitSum = 0, doubleDigitSum = 0;
        for(int i : arr) {
            if(i < 10) {
                singleDigitSum += i;
            } else {
                doubleDigitSum += i;
            }
        }
        return singleDigitSum != doubleDigitSum;
    }
}
