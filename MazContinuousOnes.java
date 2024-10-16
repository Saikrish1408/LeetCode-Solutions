// https://leetcode.com/problems/max-consecutive-ones/submissions/1422250813/

import java.util.Scanner;

public class MaxContinuousOnesACCEPTED {
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        int n = scannerObject.nextInt();
        int[] nums = new int[n];
        for(int i = 0 ; i < n ; i++) {
            nums[i] = scannerObject.nextInt();
        }
        System.out.println(findMaxConsecutiveOnes(nums));
        scannerObject.close();
    }

    public static int findMaxConsecutiveOnes(int[] nums) {
        int maxContinuous = 0;
        for(int i = 0 ; i < nums.length; i++) {
            if(nums[i] == 1) {
                int windowCount = 0;
                while(i < nums.length) {
                    if(nums[i] == 1) {
                        windowCount++;
                        i++;
                    } else {
                        break;
                    }
                }
                maxContinuous = Math.max(maxContinuous, windowCount);
            }
        }
        return maxContinuous;
    }
}
