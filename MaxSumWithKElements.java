// https://leetcode.com/problems/maximum-sum-with-exactly-k-elements/submissions/1319759090/


import java.util.Arrays;

public class MaxSumWithKElementsACCEPTED {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        int k = 3;
        System.out.println(maximizeSum(nums, k));
    }

    public static int maximizeSum(int[] nums, int k) {
        int sum = 0;
        Arrays.sort(nums);
        while(k >= 1) {
            sum += nums[nums.length - 1];
            nums[nums.length - 1]++;
            k--;
        }
        return sum;
    }
}
