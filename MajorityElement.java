//   https://leetcode.com/problems/majority-element/submissions/1309164172/


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MajorityElementACCEPTED {
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        int nums[] = {2, 2, 1, 1, 1, 2, 2};
        System.out.println(majorityElement(nums));
        scannerObject.close();
    }

    public static int majorityElement(int[] nums) {
        int no_of_elements = -1, minimumLimit = nums.length / 2;
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for(int i : nums) {
            hashMap.put(i, hashMap.getOrDefault(i, 0) + 1);
        }
        for(Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
            no_of_elements = (entry.getValue() > minimumLimit) ? entry.getKey() : no_of_elements;
        }
        return no_of_elements;
    }
}
