// https://leetcode.com/problems/smallest-even-multiple/submissions/1498825369/

import java.util.Scanner;

public class SmallestEvenMultipleACCEPTED {
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        int n = scannerObject.nextInt();
        System.out.println(smallestEvenMultiple(n));
        scannerObject.close();
    }

    public static int smallestEvenMultiple(int n) {
        if(n == 1 || n == 2) {
            return 2;
        }
        for(int i = 3 ; i <= Integer.MAX_VALUE ; i++) {
            if(i%n == 0 && i%2 == 0) {
                return i;
            }
        }
        return -1;
    }
}
