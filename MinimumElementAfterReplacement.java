// https://leetcode.com/problems/minimum-element-after-replacement-with-digit-sum/submissions/1422223868/

import java.util.Scanner;

public class MinimumElementAfterReplacement {
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        int n = scannerObject.nextInt();
        int[] nums = new int[n];
        for(int i = 0 ; i < n ; i++) {
            nums[i] = scannerObject.nextInt();
        }
        System.out.println(minElement(nums));
        scannerObject.close();
    }

    public static int minElement(int[] nums) {
        int minValue = Integer.MAX_VALUE;
        for(int i : nums) {
            int sum = 0;
            while(i > 0) {
                sum += (i % 10);
                i /= 10;
            }
            minValue = Math.min(minValue, sum);
        }
        return minValue;
    }
}
