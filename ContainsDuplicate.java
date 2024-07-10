//  https://leetcode.com/problems/contains-duplicate/submissions/1315436114/


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ContainsDuplicatesACCEPTED {
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        int[] nums = {1,2,3,1};
        System.out.println(doesHaveDuplicates(nums));
        scannerObject.close();
    }

    public static boolean doesHaveDuplicates(int[] nums) {
        HashMap<Integer, Integer> elementFrequency = new HashMap<>();
        for(int i : nums) {
            elementFrequency.put(i, elementFrequency.getOrDefault(i, 0) + 1);
        }
        for(Map.Entry<Integer, Integer> entry : elementFrequency.entrySet()) {
            if(entry.getValue() >= 2) {
                return true;
            }
        }
        return false;
    }
}
