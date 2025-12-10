import java.util.Arrays;
import java.util.Scanner;

public class SortColor {
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        int n = scannerObject.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scannerObject.nextInt();
        }
        sortColor(arr);
        System.out.println(Arrays.toString(arr));
        scannerObject.close();
    }

    public static void sortColor(int[] arr) {
        // sort 0 first
        // sort 1 second
        int zeroCount = 0, zeroIndex = 0;
        for(int i = 0 ; i < arr.length ; i++) {
            if(arr[i] == 0) {
                swap(zeroIndex, i, arr);
                zeroCount++;
                zeroIndex++;
            }
        }

        int oneCount = 0, oneIndex = zeroIndex;
        for(int i = 0 ; i < arr.length ; i++) {
            if(arr[i] == 1) {
                swap(oneIndex, i, arr);
                oneCount++;
                oneIndex++;
            }
        }
    }
    public static void swap(int right, int left, int[] arr) {
        int temp = arr[right];
        arr[right] = arr[left];
        arr[left] = temp; 
    }
}
