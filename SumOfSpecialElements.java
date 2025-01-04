// https://leetcode.com/problems/sum-of-squares-of-special-elements/submissions/1496564275/

import java.util.Scanner;

public class SumOfSpecialElementsACCEPTED {
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        int n = scannerObject.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++) {
            arr[i] = scannerObject.nextInt();
        }
        System.out.println(sumOfSquares(n, arr));
        scannerObject.close();
    }

    public static int sumOfSquares(int n, int[] arr) {
        int sum = 0;
        for(int i = 0 ; i < n ; i++) {
            if(n % (i+1) == 0) 
                sum += (arr[i]*arr[i]);
        }
        return sum;
    }
}
