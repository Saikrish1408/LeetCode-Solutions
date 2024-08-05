// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/submissions/1345719503/

import java.util.Scanner;

public class FirstLastPositioninSortedACCEPTED {
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        int n = scannerObject.nextInt();
        int[] nums = new int[n];
        for(int i = 0 ; i < n ; i++)
            nums[i] = scannerObject.nextInt();
        int target = scannerObject.nextInt();
        int[] outputIndex = searchRange(nums, target);
        for(int i : outputIndex)
            System.out.print(i + " ");
        scannerObject.close();
    }

    public static int[] searchRange(int[] nums, int target) {
        if(nums.length == 1) {
            if(nums[0] == target) {
                return new int[] {0, 0};
            }
        }
        int leftPointer = 0, rightPointer = nums.length - 1, firstIndex = -1, secondIndex = -1;
        while(leftPointer <= rightPointer) {
            if(nums[leftPointer] != target && nums[rightPointer] != target) {
                leftPointer++;
                rightPointer--;
            } else if(nums[leftPointer] == target) {
                firstIndex = leftPointer;
                int forward = leftPointer + 1;
                boolean secondFound = false;
                while(forward < nums.length) {
                    if(nums[forward] == target) {
                        secondFound = true;
                        forward++;
                    } else {
                        secondIndex = forward - 1;
                        return new int[] {firstIndex, secondIndex};
                    }
                }
                if(!secondFound) {
                    return new int[] {firstIndex, firstIndex};
                } else {
                    secondIndex = forward - 1;
                    return new int[] {firstIndex, secondIndex};
                }
            } else if(nums[rightPointer] == target) {
                firstIndex = rightPointer;
                int backward = rightPointer - 1;
                boolean secondFound = false;
                while(backward > -1) {
                    if(nums[backward] == target) {
                        secondFound = true;
                        backward--;
                    } else {
                        secondIndex = backward + 1;
                        return new int[] {secondIndex, firstIndex};
                    }
                }
                if(!secondFound) {
                    return new int[] {-1, -1};
                }
            }
        }
        return new int[] {-1,-1};
    }
}
