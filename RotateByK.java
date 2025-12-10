import java.util.Arrays;
import java.util.Scanner;

public class RotateByK {
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        int n = scannerObject.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scannerObject.nextInt();
        }
        int k = scannerObject.nextInt();
        rotateByK(arr, k);
        System.out.println(Arrays.toString(arr));
        scannerObject.close();
    }

    public static void rotateByK(int[] arr, int k) {
        if(arr.length == 0) {
            return ;
        } else if((arr.length + 1) == k) {
            while(k != 0) {
                int temp = arr[arr.length - 1];
                for(int i = arr.length - 2 ; i > -1 ; i--) {
                    arr[i + 1] = arr[i];
                }
                arr[0] = temp;
                k = 0;
            }
        } else {
            while(k >= 1) {
                int temp = arr[arr.length - 1];
                for(int i = arr.length - 2 ; i > -1 ; i--) {
                    arr[i + 1] = arr[i];
                }
                arr[0] = temp;
                k--;
            }
        }
    }
}