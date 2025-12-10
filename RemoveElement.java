import java.util.Arrays;
import java.util.Scanner;

public class RemoveElement {
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        int n = scannerObject.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scannerObject.nextInt();
        }
        int val = scannerObject.nextInt();
        int validIntegers = removeVal(arr, val);
        System.out.println(validIntegers);
        System.out.println(Arrays.toString(arr));
        scannerObject.close();
    }

    public static int removeVal(int[] arr, int val) {
        int validIntegers = 0, movingPointer = arr.length - 1;
        for(int i = 0 ; i < arr.length ; i++) {
            if(arr[i] == val && i < movingPointer) {
                while(arr[movingPointer] == val) {
                    movingPointer--;
                }
                int temp = arr[movingPointer];
                arr[movingPointer] = val;
                arr[i] = temp;
                validIntegers++;
                movingPointer--; 
            }
        }
        return arr.length - validIntegers;
    }
}
