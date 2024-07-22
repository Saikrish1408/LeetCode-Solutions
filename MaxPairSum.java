// https://leetcode.com/problems/max-pair-sum-in-an-array/submissions/1329138226/


import java.util.Scanner;

public class MaxPairSum {
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        int n = scannerObject.nextInt();
        int[] nums = new int[n];
        for(int i = 0 ; i < n ; i++)
            nums[i] = scannerObject.nextInt();
        System.out.println(maxSum(nums));
        scannerObject.close();
    }

    public static int maxSum(int[] nums) {
        int[] digits = new int[nums.length];
        int maxSum = -1;
        int iterator = 0;
        for(int i = 0 ; i < nums.length ; i++) {
            int largest = -1;
            int n = nums[i];
            while (n > 0) {
                largest = Math.max(largest, n % 10);
                n /= 10;
            }
            digits[iterator++] = largest;
        }
        for(int i : digits)
            System.out.print(i + " ");
        for(int i = 0 ; i < (digits.length - 1) ; i++) {
            for(int j = (i + 1) ; j < digits.length; j++) {
                if(digits[i] == digits[j]) {
                    maxSum = Math.max(maxSum, nums[i] + nums[j]);
                }
            }
        }
        if(maxSum != -1)
            return maxSum;
        return -1;
    }
}
