// https://leetcode.com/problems/the-two-sneaky-numbers-of-digitville/submissions/1422237148/

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SneakyNumberOfDigitVilleACCEPTED {
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        int n = scannerObject.nextInt();
        int[] nums = new int[n];
        for(int i = 0 ; i < n ; i++) {
            nums[i] = scannerObject.nextInt();
        }
        int[] output = getSneakyNumbers(nums);
        System.out.println(Arrays.toString(output));
        scannerObject.close();
    }

    public static int[] getSneakyNumbers(int[] nums) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int[] sneakyNumbers = new int[2];
        int iterator = 0;
        for(int i : nums) {
            hashMap.put(i, hashMap.getOrDefault(i, 0) + 1);
        }
        for(Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
            if(entry.getValue() == 2) {
                sneakyNumbers[iterator++] = entry.getKey();
            }
        }
        return sneakyNumbers;
    }
}
