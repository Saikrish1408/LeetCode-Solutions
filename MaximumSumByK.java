import java.util.Scanner;

public class MaximumSumByK {
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        int n = scannerObject.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++) {
            arr[i] = scannerObject.nextInt();
        }
        int k = scannerObject.nextInt();
        System.out.println(maximumSumByK(arr, k));
        scannerObject.close();
    }

    public static int maximumSumByK(int[] arr, int k) {
        int  sum = 0;
        for(int i = 0 ; i < k ; i++) {
            sum += arr[i];
        }
        int maxSum = sum;
        int left = 0, right = k - 1;
        while(right < arr.length - 1) {
            sum -= arr[left];
            left++;
            right++;
            sum += arr[right];
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }
}