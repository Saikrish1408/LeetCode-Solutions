// https://leetcode.com/problems/minimum-operations-to-exceed-threshold-value-i/submissions/1325380715/

import java.util.Arrays;
import java.util.Scanner;

public class MinOperationThreshold {
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        int[] nums = {2,10,11,1,3};
        int k = 10;
        System.out.println(minOperations(nums, k));
        scannerObject.close();
    }

    public static int minOperations(int[] nums, int k) {
        Arrays.sort(nums);
        for(int i = 0 ; i < nums.length ; i++) {
            if(nums[i] >= k)
                return i;
        }
        return 0;
    }
}
