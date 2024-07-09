// https://leetcode.com/problems/harshad-number/submissions/1314319726/

import java.util.Scanner;

public class HarshadNumberACCEPTED {
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        int number = scannerObject.nextInt();
        System.out.println(ifHarshadNumber(number));
        scannerObject.close();
    }

    public static int ifHarshadNumber(int number) {
        int x = number, sum = 0;
        while(x > 0) {
            sum += (x%10);
            x /= 10;
        }
        if(number%sum == 0)
            return sum;
        return -1;
    }
}
