// https://leetcode.com/problems/minimum-number-game/submissions/1310795914/

import java.util.Arrays;
import java.util.Scanner;

public class MinimumNumberGameACCEPTED {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nums = {5, 4, 2, 3};
        int[] output = minimumNumberGame(nums);
        for(int i : output)
            System.out.print(i + " ");
        scanner.close();
    }

    public static int[] minimumNumberGame(int[] nums) {
        int[] result = new int[nums.length];
        Arrays.sort(nums);
        for(int i = 0, iterator = 0 ; i < (nums.length - 1) ; i+=2) {
            swapValues(i, (i + 1), nums);
            result[iterator++] = nums[i];
            result[iterator++] = nums[i + 1];
        }
        return result;
    }

    public static void swapValues(int current, int next, int[] nums) {
        int temp = nums[current];
        nums[current] = nums[next];
        nums[next] = temp;
    }
}
