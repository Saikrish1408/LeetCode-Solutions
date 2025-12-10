import java.util.Arrays;
import java.util.Scanner;

public class MoveZeros {
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        int n = scannerObject.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++) 
            arr[i] = scannerObject.nextInt();
        moveZeroes(arr);
        System.out.println(Arrays.toString(arr));
        scannerObject.close();
    }

    // public static void moveZeroes(int[] arr) {
    //     for(int left = 0 ; left < arr.length - 1 ; left++) {
    //         if(arr[left] == 0) {
    //             int right = left + 1;
    //             while(right < arr.length) {
    //                 if(arr[right] != 0) {
    //                     int temp = arr[right];
    //                     arr[right] = arr[left];
    //                     arr[left] = temp;    
    //                 } else {
    //                     right++;
    //                 }
    //             } 
    //         }
    //     }
    //}

    public static void moveZeroes(int[] arr) {
        int nonZero = 0;
        for(int i = 0 ; i < arr.length ; i++) {
            if(arr[i] != 0) {
                int temp = arr[i];
                arr[nonZero] = arr[i];
                arr[i] = temp;
                nonZero++;;
            }
        }
    }
}
