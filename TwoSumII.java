import java.util.Arrays;
import java.util.Scanner;

public class TwoSumII {
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        int n = scannerObject.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++) {
            arr[i] = scannerObject.nextInt();
        }
        int target = scannerObject.nextInt();
        int[] indices = twoSumII(arr, target);
        System.out.println(Arrays.toString(indices));
        scannerObject.close();
    }

    public static int[] twoSumII(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while(left < right) {
            int sum = arr[left] + arr[right];
            if(sum > target) {
                right--;
            } else if(sum < target) {
                left++;
            } else {
                return new int[] {left + 1, right + 1};
            }
        }
        return new int[] {-1, -1};
    }
}
