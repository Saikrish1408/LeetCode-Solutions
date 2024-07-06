//  https://leetcode.com/problems/find-minimum-operations-to-make-all-elements-divisible-by-three/submissions/1311380654/

import java.util.Scanner;

public class MinimumOperationsACCEPTED {
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        int[] nums = {3, 6, 9};
        System.out.println(minimumOperations(nums));
        scannerObject.close();
    }

    public static int minimumOperations(int[] nums) {
        int count = 0;
        for(int i : nums) {
            if(((i+1)%3 == 0) || ((i-1)%3 == 0) && ((i%3) != 0))
                count++;
        }
        return count;
    }

}
