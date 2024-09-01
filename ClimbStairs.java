// https://leetcode.com/problems/climbing-stairs/submissions/1375180478/

package LeetCode_Solutions;

import java.util.Scanner;

public class ClimbimgStairs {
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        int n = scannerObject.nextInt();
        System.out.println(climbStairs(n));
        scannerObject.close();
    }

    public static int climbStairs(int n) {
        int dp[] = new int[n + 1];
        return OptimizedusingDynamicProgramming(dp, n);
    }

    public static int OptimizedusingDynamicProgramming(int[] dp, int n) {
        // base case...
        if(n == 0 || n == 1) {
            return 1;
        }
        if(dp[n] != 0) {
            return dp[n];
        }
        return dp[n] = OptimizedusingDynamicProgramming(dp, (n - 1)) + OptimizedusingDynamicProgramming(dp, (n - 2));
    }
}
