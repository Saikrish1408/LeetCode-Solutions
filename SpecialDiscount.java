//  https://leetcode.com/problems/final-prices-with-a-special-discount-in-a-shop/submissions/1307418206/


import java.util.Scanner;

public class SpecialDiscount {
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        int n = scannerObject.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++)
            arr[i] = scannerObject.nextInt();
        int[] outputArray = finalSpecialDiscount(n, arr);
        for(int i : outputArray) {
            System.out.print(i + " ");
        }
        scannerObject.close();
    }

    public static int[] finalSpecialDiscount(int n, int[] arr) {
        int[] outputArray = new int[n];
        int iterator = 0;
        for(int i = 0 ; i < (n - 1) ; i++) {
            int j = (i + 1);
            boolean smallerFound = false;
            while(j < n) {
                if(arr[i] >= arr[j]) {
                    smallerFound = true;
                    outputArray[iterator++] = arr[i] - arr[j];
                    break;
                }
                j++;
            }
            if(!smallerFound)
                outputArray[iterator++] = arr[i];
        }
        outputArray[iterator] = arr[n - 1];
        return outputArray;
    }
}
