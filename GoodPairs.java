//  https://leetcode.com/problems/find-the-number-of-good-pairs-i/submissions/1314294423/

import java.util.Scanner;

public class CountGoodPairsACCEPTED {
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        int n = scannerObject.nextInt();
        int m = scannerObject.nextInt();
        int k = scannerObject.nextInt();
        int[] num1 = new int[n];
        int[] num2 = new int[m];
        for (int i = 0; i < n; i++) {
            num1[i] = scannerObject.nextInt();
        }
        for (int i = 0; i < m; i++) {
            num2[i] = scannerObject.nextInt();
        }
        System.out.println(pairsCount(n, m, k, num1, num2));
        scannerObject.close();
    }

    public static int pairsCount(int n, int m, int k, int[] num1, int[] num2) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (num1[i] % (num2[j] * k) == 0) {
                    count++;
                }
            }
        }
        return count;
    }
}
