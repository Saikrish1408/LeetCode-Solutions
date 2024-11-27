// https://leetcode.com/problems/check-balanced-string/submissions/1464406029/

import java.util.Scanner;

public class CheckBalanceString {
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        String inputString = scannerObject.nextLine();
        System.out.println(isBalanced(inputString));
        scannerObject.close();
    }

    public static boolean isBalanced(String num) {
        int evenSum = 0, oddSum = 0;
        for(int i = 0 ; i < num.length() ; i++) {
            int integerValue = Integer.parseInt(Character.toString(num.charAt(i)));
            if(i%2 == 0) {
                evenSum += integerValue;
            } else {
                oddSum += integerValue;
            }
        }
        return evenSum == oddSum;
    }
}
