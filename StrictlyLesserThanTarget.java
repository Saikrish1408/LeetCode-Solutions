// https://leetcode.com/problems/count-pairs-whose-sum-is-less-than-target/submissions/1317709483/


public class StrictlyLessThanTarget {
    public static void main(String[] args) {
        int[] nums = {-1,1,2,3,1};
        int target = 2;
        System.out.println(countPairs(nums, target));

    }


    // Make sure that you change the int[] to List in the LeetCode Editor!!!



    public static int countPairs(int[] nums, int target) {
        int pairsCount = 0;
        for(int i = 0 ; i < nums.length - 1 ; i++) {
            int j = (i + 1);
            while(j < nums.length) {
                if((nums[i] + nums[j]) < target)
                    pairsCount++;
                j++;
            }
        }
        return pairsCount;
    }
}
