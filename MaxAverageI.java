import java.util.Scanner;

public class MaxAverageI {
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        int n = scannerObject.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scannerObject.nextInt();
        }
        int k = scannerObject.nextInt();
        System.out.println(maxAverage(arr, k));
        scannerObject.close();
    }

    public static double maxAverage(int[] arr, int k) {
        if(arr.length == 1) {
            return (double) arr[0];
        }
        double maximumAverage = 0.0;
        double sum = 0;
        for(int i = 0 ; i < k ; i++) {
            sum += arr[i];
        }
        maximumAverage = sum / k;
        int leftPointer = 0;
        for(int rightPointer = k ; rightPointer < arr.length ; rightPointer++) {
            sum = sum - arr[leftPointer];
            sum = sum + arr[rightPointer];
            leftPointer++;
            maximumAverage = Math.max(maximumAverage, (double)(sum / k));
            System.out.println(maximumAverage);
        }
        return maximumAverage;
    }
}
