import java.util.HashMap;
import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        int n = scannerObject.nextInt();
        int[] nums = new int[n];
        for(int i = 0 ; i < n ; i++) {
            nums[i] = scannerObject.nextInt();
        }
        int target = scannerObject.nextInt();
        int[] outputArr = twoSum(n, nums, target);
        for(int i : outputArr) {
            System.out.print(i + " ");
        }
        scannerObject.close();
    }

    public static int[] twoSum(int n, int[] arr, int target) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for(int i = 0 ; i < n ; i++) {
            hashMap.put(arr[i], i);
        }
        for(int i = 0 ; i < n ; i++) {
            int sum = target - arr[i];
            if(hashMap.containsKey(sum) && i != hashMap.get(sum)) {
                return new int[] {i, hashMap.get(sum)};
            }
        }
        return new int[] {-1, -1};
    }
}
