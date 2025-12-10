import java.util.Scanner;

public class MaximumPointsFromCards {
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        int n = scannerObject.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scannerObject.nextInt();
        }
        int k = scannerObject.nextInt();
        System.out.println(maxPointsFromCards(arr, k));
        scannerObject.close();
    }

    public static int maxPointsFromCards(int[] arr, int k) {
        int maxPoint = -1;
        int leftSum = 0, rightSum = 0;
        for (int i = 0; i < k; i++) {
            leftSum += arr[i];
        }
        maxPoint = leftSum;
        int leftPointer = (k - 1), rightPointer = (arr.length - 1);
        while(leftPointer > -1) {
            leftSum = leftSum - arr[leftPointer];
            rightSum = rightSum + arr[rightPointer];
            leftPointer--;
            rightPointer--;
            maxPoint = Math.max(maxPoint, (leftSum + rightSum));
        }
        return maxPoint;
    }
}
