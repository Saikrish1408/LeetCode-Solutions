import java.util.HashSet;
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
        for(int i = 0 ; i < arr.length - 1 ; i++) {
            for(int j = (i + 1) ; j < arr.length ; j++) {
                if((arr[i] + arr[j]) == target) {
                    return new int[] {i, j};
                }
            }
        }
        return new int[] {-1, -1};
    }
}
