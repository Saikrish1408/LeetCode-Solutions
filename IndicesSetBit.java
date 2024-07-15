// https://leetcode.com/problems/sum-of-values-at-indices-with-k-set-bits/submissions/1321065698/


public class IndicesSetBitsACCEPTED {
    public static void main(String[] args) {
        int[] nums = {5,10,1,5,2};
        int k = 1;
        System.out.println(sumIndicesWithKSetBits(nums, k));
    }

    public static int sumIndicesWithKSetBits(int[] nums, int k) {
        int sum = 0;
        for(int i = 0 ; i < nums.length ; i++) {
            String binaryString = Integer.toBinaryString(i);
            int ones_count = 0, j = 0;
            while(j < binaryString.length()) {
                if(binaryString.charAt(j) == '1') {
                    ones_count++;
                }
                j++;
            }
            if(ones_count == k) {
                sum += nums[i];
            }
        }
        return sum;
    }
}
