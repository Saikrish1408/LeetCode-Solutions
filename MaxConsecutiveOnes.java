import java.util.Scanner;

public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        int n = scannerObject.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scannerObject.nextInt();
        }
        int k = scannerObject.nextInt();
        System.out.println(maxConsecutiveOnesBruteForce(arr, k));
        System.out.println(maxConsecutiveOnesOptimized(arr, k));

        scannerObject.close();
    }
    
    public static int maxConsecutiveOnesBruteForce(int[] arr, int k) {
        int maxLength = 0;  
        for(int i = 0 ; i < arr.length ; i++) {
            int noOfZeros = 0;
            for(int j = i ; j < arr.length ; j++) {
                if(arr[j] == 0) {
                    noOfZeros += 1;
                }
                if(noOfZeros <= k) {
                    maxLength = Math.max(maxLength, (j - i + 1));
                } else {
                    break;
                }
            }
        }
        return maxLength;
    }

    public static int maxConsecutiveOnesOptimized(int[] arr, int k) {
        int maxLength = 0;
        int left = 0, right = 0, zeros = 0;
        while(right < arr.length) { 
            if(arr[right] == 0) {
                zeros += 1;
            }
            if(zeros > k) {
                if(arr[left] == 0) zeros--;
                left++;
            }
            if(zeros <= k) {
                maxLength = Math.max(maxLength, (right - left + 1));
            }
            right++;
        }
        return maxLength;
    }
}
