import java.util.Arrays;
import java.util.Scanner;

public class SquareSortedArray {
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        int n = scannerObject.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++)
            arr[i] = scannerObject.nextInt();
        squareTheSortedArray(n, arr);
        for(int i : arr) {
            System.out.print(i + " ");
        }
        scannerObject.close();
    }

    public static void squareTheSortedArray(int n, int[] arr) {
        for(int i = 0 ; i < n ; i++) {
            arr[i] = arr[i] * arr[i];
        }

        Arrays.sort(arr);
    }
