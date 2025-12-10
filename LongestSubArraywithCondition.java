import java.util.Scanner;

public class LongestSubArraywithCondition {
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        int n = scannerObject.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scannerObject.nextInt();
        }
        int k = scannerObject.nextInt();
        System.out.println(maxLengthOfSubArray(arr, k));
        scannerObject.close();
    }

    public static int maxLengthOfSubArray(int[] arr, int k) {
        int maxLength = 0;
        // to-do
        return maxLength;
    }
}
