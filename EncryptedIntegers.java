// https://leetcode.com/problems/find-the-sum-of-encrypted-integers/submissions/1464933230/

import java.util.Scanner;

public class EncryptedIntegersACCEPTED {
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        int n = scannerObject.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++)
            arr[i] = scannerObject.nextInt();
        System.out.println(encryptedInteger(arr));
        scannerObject.close();
    }

    public static int encryptedInteger(int[] arr) {
        int encryptedSum = 0;
        for(int i : arr) {
            int largestDigit = 0;
            int intgerLength = (int) (Math.log10(i) + 1);
            while(i > 0) {
                int rem = i%10;
                largestDigit = (largestDigit < rem) ? rem : largestDigit;
                i /= 10;
            }
            if(intgerLength == 1) {
                encryptedSum += ((largestDigit) * 1);
            } else if(intgerLength == 2) {
                encryptedSum = (encryptedSum + (largestDigit) * 10) + largestDigit;
            } else if(intgerLength == 3) {
                encryptedSum += ((largestDigit) * 100) + (largestDigit * 10) + largestDigit;
            } else if(intgerLength == 4) {
                encryptedSum += ((largestDigit) * 1000) + (largestDigit * 100) + (largestDigit * 10) +  largestDigit;
            }
        }
        return encryptedSum;
    }
    
}
