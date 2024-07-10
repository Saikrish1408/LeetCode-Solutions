// https://leetcode.com/problems/special-array-i/submissions/1316785257/

import java.util.Scanner;

public class SpecialParityArray {
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        int[] nums = {2,1,4};
        System.out.println(isSpecialArray(nums));
        scannerObject.close();
    }

    public static boolean isSpecialArray(int[] nums) {
        if(nums.length == 1)
            return true;
        int i = 0, j = 1;
        while(i < nums.length - 1) {
            if((nums[i]%2 == 0 && nums[j]%2 != 0) || (nums[i]%2 == 1 && nums[j]%2 == 0)) {
                i++;
                j++;
            } else {
                return false;
            }
        }
        return true;
    }
}
