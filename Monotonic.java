import java.util.Scanner;

public class MonotonicACCEPTED {
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        int n = scannerObject.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++)
            arr[i] = scannerObject.nextInt();
        System.out.println(monotonicArray(arr));
        scannerObject.close();
    }

    public static boolean monotonicArray(int[] arr) {

        if(arr.length == 1) {
            return true;
        }

        boolean isIncreasing = true;
        boolean isDecreasing = true;

        for(int i = 0 ; i < arr.length - 1 ; i++) {
            if(!(arr[i] >= arr[i + 1])) {
                isDecreasing = false;
            }
            if(i == arr.length - 2 && isDecreasing) {
                return true;
            }
        }
        for(int i = 0 ; i < arr.length - 1 ; i++) {
            if(!(arr[i] <= arr[i + 1])) {
                isIncreasing = false;
            }
            if(i == arr.length - 2 && isIncreasing) {
                return true;
            }
        }
        return false;
    }
}
