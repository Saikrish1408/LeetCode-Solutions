// https://leetcode.com/problems/remove-duplicates-from-sorted-array/submissions/1350132124/
// Pushed...


import java.util.Scanner;

public class RemoveDuplicatesSortedArrayINCOMPLETE {
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(kFromDuplicates(nums));
        System.out.print("Array Elements: ");
        for(int i : nums) {
            System.out.print(i + " ");
        }
        scannerObject.close();
    }

    public static int kFromDuplicates(int[] nums) {
        int left = 0, right = 1;
        int changesMade = 0;
        while(right < nums.length) {
            if(nums[left] == nums[right]) {
                right++;
            } else if(nums[left] != nums[right] && left < nums.length - 1) {
                nums[left + 1] = nums[right];
                left++;
                right++;
                changesMade++;
            }
        }
        return changesMade + 1;
    }
}
